package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DatatablesPage;

public class DataTablesStepDefinitions {
    DatatablesPage datatablesPage=new DatatablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        datatablesPage.newButonunaBasar.click();

    }
    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstName) {
        datatablesPage.firstName.sendKeys(firstName);

    }
    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastName) {
        datatablesPage.lastName.sendKeys(lastName);

    }
    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        datatablesPage.position.sendKeys(position);

    }
    @Then("office bolumune {string} yazar")
    public void office_bolumune_yazar(String office) {
        datatablesPage.office.sendKeys(office);

    }
    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        datatablesPage.extn.sendKeys(extension);

    }
    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
        datatablesPage.startDate.sendKeys(startDate);

    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        datatablesPage.salary.sendKeys(salary);

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        datatablesPage.create.click();

    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        datatablesPage.search.sendKeys(firstName);
    }


    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstName) {
        Assert.assertTrue(datatablesPage.aramaSonucIlkELement.getText().contains(firstName));
    }
}
