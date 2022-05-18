package mx.gob.imss.configuracion;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class Cors implements Filter {

    public static final String CORS_AC_ALLOW_METHODS = "GET, POST, PATCH, PUT, DELETE, OPTIONS";
    public static final String CORS_AC_ALLOW_CREDENTIALS = "true";
    public static final String CORS_AC_ALLOW_HEADERS = "Content-Type, Access-Control-Allow-Origin, Access-Control-Allow-Credentials, Access-Control-Allow-Headers, Access-Control-Allow-Methods, Access-Control-Expose-Headers, Authorization, X-Requested-With, Origin, Access-Control-Max-Age, X-Auth-Token, X-CSRF-TOKEN";
    public static final String CORS_AC_EXPOSE_HEADERS = "X-Auth-Token, X-CSRF-TOKEN";
    public static final String CORS_AC_MAX_AGE = "3600";
    public static final String ORIGIN = "Origin";

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String origin = request.getHeader(ORIGIN);

        response.setHeader("Access-Control-Allow-Origin", origin);// * or origin as u prefer
        response.setHeader("Access-Control-Allow-Credentials", CORS_AC_ALLOW_CREDENTIALS);
        response.setHeader("Access-Control-Allow-Headers", CORS_AC_ALLOW_HEADERS);
        response.setHeader("Access-Control-Allow-Methods", CORS_AC_ALLOW_METHODS);
        response.setHeader("Access-Control-Expose-Headers", CORS_AC_EXPOSE_HEADERS);
        response.setHeader("Access-Control-Max-Age", CORS_AC_MAX_AGE);

        chain.doFilter(req, res);
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }

}