package ame.web.login;

import ame.web.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObject {

        private static final String URL_LOGIN_PAGE = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

        public LoginPage() {
            super(null);
            this.browser.navigate().to(URL_LOGIN_PAGE);
        }

    public void  preencheLogin(String email, String password) {
         this.browser.findElement(By.id("email")).sendKeys(email);
         this.browser.findElement(By.id("passwd")).sendKeys(password);
         this.browser.findElement(By.id("SubmitLogin")).click();
  }

   public boolean isPaginaDeLogin() {
            return browser.getCurrentUrl().equals(URL_LOGIN_PAGE);
   }

   public Boolean isPaginaUsuarioLogado() {
        return browser.getPageSource().contains("Welcome to your account. Here you can manage all of your personal information and orders.");
   }

   public boolean msgSenhaIncorreta() {
        if(browser.getPageSource().contains("Authentication failed.") || browser.getPageSource().contains("Invalid password.")){
            return true;
       }
       return false;
   }

    public boolean msgEmailEsenhaEmBranco() {
        return browser.getPageSource().contains("An email address required.");
    }

}