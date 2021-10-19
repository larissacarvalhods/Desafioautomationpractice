package testes;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjetcs.*;
import utils.Browser;
import utils.Utils;

import java.util.Random;

import static org.junit.Assert.*;

@Feature("Testes site de ecommerce")

public class SetupTestes extends BaseTests {

    Random random = new Random();
    HomePage home = new HomePage ();
    MyAccountPage myAccount = new MyAccountPage();
    LoginPage login = new LoginPage();
    SearchPage search = new SearchPage();
    CategoryPage category = new CategoryPage();
    ProductPage  pdp = new ProductPage();
    CartPage cart = new CartPage();
    CreatAccountPage account = new CreatAccountPage();
    CheckoutPage checkout = new CheckoutPage();

    //Testes realizados nas aulas

    @Story("Realizar teste abrir o site")
    @Test
    public void testOpeningAndLoadingPage(){

       assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));

    }

    @Story("Realizar Login")
    @Test
    public void testeLogin(){

        home.clickBtnLogim();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("/index.php?controller=authentication&back=my-account")));
        login.fillEmail("jose.silva@gmail.com");
        login.fillpassword("102030");
        login.clickBtnSubmitLogin();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("/index.php?controller=my-account")));
    }

    @Story("Realizar busca de um produto")
    @Test
    public void testSearch(){

        String quest = "DRESS";
        String questResultQtd="7";
        home.doSearch(quest);
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"","") ,quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));
    }

    @Story("Acessar categoria")
    @Test
    public void  testAcessyCategoryTshirts(){
        home.clickCategoryTshirts();
        assertTrue(category.isPageTshirts());
    }

    @Story("Adicionar produto no carrinho")
    @Test
    public void testAddProductToProductPage(){
        String nameProductCategory = category.getProductNameCategory();
        testAcessyCategoryTshirts();
        category.clickProductAddToProductPage();
        assertEquals(pdp.getProductNamePDP(),(nameProductCategory));
    }

    @Story("")
    @Test
    public void testAddProductToCarPage(){

        testAddProductToProductPage();
        String nameProductPDP = pdp.getProductNamePDP();
        System.out.println(pdp.getProductNamePDP());
        pdp.clickButtonAddToCart();
        pdp.clickButtonModalProceedToCheckout();

        assertEquals(cart.getNameProductCart(),(nameProductPDP));

    }

    //Desafio WEB

    @Story("Realizar Cadastro")
    @Test
    public void creatAccountTest(){

        //Clica em Sin in
        home.clickBtnLogim();
        //Preenche  email no bloco "CREATE AN ACCOUNT"
        String email = "resetcwi" + random.nextInt() +"@gmail.com";
        login.fillEmailcreatAccount(email);
        login.clickBtnCreatAccount();
        //Prenche dados "YOUR PERSONAL INFORMATION"
        account.selectTitleMr();
        account.fillFirstName("usuario");
        account.fillLastName("reset");
        account.fillCreatPassword("102030");
        account.fillDateOfBirth("10","May","1991");
        account.clickSignUpNewsletter();
        account.clickReceiveSpecialOffers();
        account.fillFirstNameYourAdress("reset");
        account.fillLastNameYourAdress("usuário");
        account.fillCompany("Cwi");
        account.fillAddress(" Amphitheatre Parkway");
        account.fillAddressLine2("building");
        account.fillState("California");
        account.fillCity("Mountain View");
        account.fillPostalCode("90001");
        account.fillCountry("United States");
        account.fillAdditionalInformation("others");
        account.fillHomePhone("8998748965");
        account.fillMobilePhone("9874589644");
        account.fillAddressAlias("  others");
        //Clica em Registrar
        account.clickBtnRegister();

        assertTrue(myAccount.AuthenticationPageMyAccount().contains("MY ACCOUNT"));
        assertTrue(myAccount.getNameUser().contains("usuario reset"));

    }

    //Desafio Web

     @Story("Realizar uma compra")
     @Test
     public void testBuyProduct()  {

         //Acessa Sin in
         home.clickBtnLogim();
         // Preenche dados no bloco " ALREADY REGISTERED?"
         login.fillEmail("jose.silva@gmail.com");
         login.fillpassword("102030");
         login.clickBtnSubmitLogin();
         //Pesquisa por produto
         String product = "T-SHIRTS";
         home.doSearch(product);
         //Adiciona produto no carinho
         category.clickProductAddToCart();
         category.clickProceed();
         //Checkout das compras
         checkout.clickProceedToCheckoutSumary();
         checkout.fillAddCommentOrder("others");
         checkout.clickProceedToCheckout();
         checkout.selectAceptTermsOfService();
         checkout.clickProceedToCheckout();
         //Seleciona método de pagamento
         checkout.selectPaymanetMethod();
         checkout.clickConfirmOrder();

         assertTrue(checkout.authenticationPageCheckout().contains("ORDER CONFIRMATION"));
         assertTrue(checkout.getConfirmBuy().contains("Your order on My Store is complete."));
    }


}
