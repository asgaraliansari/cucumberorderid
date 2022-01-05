Feature: verify adactin webpage
Scenario Outline: check adactin order is working
Given user should login adactin
When user should enter "<username>" and "<password>"
And user should select hotels "<location>" "<hotels>" "<room type>"  "<no of room>" "<chk in date>" "<chk out date>" "<adult per room>" and "<chld per room>"
And user should slct hotel
And user should book a hotel "<firstName>" "<lastName>" "<address>" "<cardno>" "<cardtype>" "<expm>" "<expyear>" and "<cvvno>"


Examples: 
|username|password |location|hotels    |room type|no of room|chk in date|chk out date|adult per room|chld per room|firstName|lastName|address |cardno          |cardtype|expm|expyear|cvvno|
|asgarali|123456789|Sydney  |Hotel Creek|Deluxe  |2 - Two   |20/12/2021 |21/12/2021  |2 - Two       |1 - One      |asgar    |ali     |rk nagar|1234567887654321|VISA    |June|2022   |123  |
|asgarali|123456789|Sydney  |Hotel Creek|Deluxe  |2 - Two   |20/12/2021 |21/12/2021  |2 - Two       |1 - One      |asgar    |ali     |rk nagar|1234567887654321|VISA    |June|2022   |123  |     
|asgarali|123456789|Sydney  |Hotel Creek|Deluxe  |2 - Two   |20/12/2021 |21/12/2021  |2 - Two       |1 - One      |asgar    |ali     |rk nagar|1234567887654321|VISA    |June|2022   |123  |
|asgarali|123456789|Sydney  |Hotel Creek|Deluxe  |2 - Two   |20/12/2021 |21/12/2021  |2 - Two       |1 - One      |asgar    |ali     |rk nagar|1234567887654321|VISA    |June|2022   |123  |
|asgarali|123456789|Sydney  |Hotel Creek|Deluxe  |2 - Two   |20/12/2021 |21/12/2021  |2 - Two       |1 - One      |asgar    |ali     |rk nagar|1234567887654321|VISA    |June|2022   |123  |
|asgarali|123456789|Sydney  |Hotel Creek|Deluxe  |2 - Two   |20/12/2021 |21/12/2021  |2 - Two       |1 - One      |asgar    |ali     |rk nagar|1234567887654321|VISA    |June|2022   |123  |
|asgarali|123456789|Sydney  |Hotel Creek|Deluxe  |2 - Two   |20/12/2021 |21/12/2021  |2 - Two       |1 - One      |asgar    |ali     |rk nagar|1234567887654321|VISA    |June|2022   |123  |
|asgarali|123456789|Sydney  |Hotel Creek|Deluxe  |2 - Two   |20/12/2021 |21/12/2021  |2 - Two       |1 - One      |asgar    |ali     |rk nagar|1234567887654321|VISA    |June|2022   |123  |
|asgarali|123456789|Sydney  |Hotel Creek|Deluxe  |2 - Two   |20/12/2021 |21/12/2021  |2 - Two       |1 - One      |asgar    |ali     |rk nagar|1234567887654321|VISA    |June|2022   |123  |
|asgarali|123456789|Sydney  |Hotel Creek|Deluxe  |2 - Two   |20/12/2021 |21/12/2021  |2 - Two       |1 - One      |asgar    |ali     |rk nagar|1234567887654321|VISA    |June|2022   |123  |