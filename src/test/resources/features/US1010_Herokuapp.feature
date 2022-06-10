Feature: US1010 herokuapp

  @her
  Scenario: TC15 herokuapp'dan delete butonu calismali

    Given kullanici "herokuappUrl" anasayfasinda
    And   add element butonuna basar
    And   kullanici 2 sn bekler
    Then  Delete butonu gorunur oluncaya kadar bekler
    And   Delete butonunun gorunur oldugunu test eder
    And   kullanici 2 sn bekler
    Then  Delete butonuna basar
    And   Delete butonunun gorunmedigini test eder
    And   kullanici 2 sn bekler
    And   sayfayi kapatir
