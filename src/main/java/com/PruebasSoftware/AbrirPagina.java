package com.PruebasSoftware;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirPagina {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.bbc.com/news");
            String titulo = driver.getTitle();
            System.out.println("Titulo de la pagina: " + titulo);

            if (titulo.contains("BBC")) {
                System.out.println("Validacion correcta");
            } else {
                System.out.println("Validacion incorrecta");
            }

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("La ejecucion fue interrumpida");
        } finally {
            driver.quit();
        }
    }
}