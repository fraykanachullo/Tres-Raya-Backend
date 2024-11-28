package pe.edu.upeu.tres_enraya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Marca esta clase como una configuración de Spring
public class Configuraciones {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @SuppressWarnings("null")
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Aplica CORS a todas las rutas que empiecen con /api
                        .allowedOrigins("http://localhost:4200") // Permite solicitudes desde este origen
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos HTTP permitidos
                        .allowedHeaders("*") // Permite todos los encabezados
                        .allowCredentials(true) // Permite el uso de cookies o credenciales
                        .maxAge(3600); // Tiempo en segundos para que las configuraciones se cacheen
            }
        };
    }
}
