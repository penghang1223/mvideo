package controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Schean
 * @Date: 2020/10/24 16:13
 */
@WebServlet(name = "QRCodeServlet")
public class QRCodeServlet extends BaseServlet {
    public static final String URL = "http://localhost:8080/mvideo/UserServlet?action=payMoney&money=";
    private static final String KEY = "money";
    private static final String SIZE = "msize";
    private static final String IMAGETYPE = "JPEG";

    protected void getCode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String keycode = request.getParameter(KEY);

        if (keycode != null && !"".equals(keycode)) {
            ServletOutputStream stream = null;
            keycode = URL + keycode;
            try {
                int size = 129;
                String msize = request.getParameter(SIZE);
                if (msize != null && !"".equals(msize.trim())) {
                    try {
                        size = Integer.valueOf(msize);
                    } catch (NumberFormatException e) {
                        //TODO output to log
                    }
                }
                stream = response.getOutputStream();
                QRCodeWriter writer = new QRCodeWriter();
                BitMatrix m = writer.encode(keycode, BarcodeFormat.QR_CODE, size, size);
                MatrixToImageWriter.writeToStream(m, IMAGETYPE, stream);
            } catch (WriterException e) {
                e.printStackTrace();
            } finally {
                if (stream != null) {
                    stream.flush();
                    stream.close();
                }
            }
        }

    }

}
