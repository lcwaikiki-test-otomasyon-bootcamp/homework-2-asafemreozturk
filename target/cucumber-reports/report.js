$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddShoppingItem.feature");
formatter.feature({
  "line": 1,
  "name": "Add shopping item",
  "description": "",
  "id": "add-shopping-item",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add shopping item",
  "description": "",
  "id": "add-shopping-item;add-shopping-item",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@cart"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Navigate to the Amazon website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Search for product",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click search button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Select the first product from list",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Add product to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Control that the product has been successfully added to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Return to cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddShoppingItem.Navigate_To_The_Website()"
});
formatter.result({
  "duration": 4325443400,
  "status": "passed"
});
formatter.match({
  "location": "AddShoppingItem.Search_For_Product()"
});
formatter.result({
  "duration": 531188500,
  "status": "passed"
});
formatter.match({
  "location": "AddShoppingItem.Click_Search_Button()"
});
formatter.result({
  "duration": 1444793700,
  "status": "passed"
});
formatter.match({
  "location": "AddShoppingItem.Select_The_First_Product_From_List()"
});
formatter.result({
  "duration": 2162251200,
  "status": "passed"
});
formatter.match({
  "location": "AddShoppingItem.Add_Product_To_The_Cart()"
});
formatter.result({
  "duration": 1005286700,
  "status": "passed"
});
formatter.match({
  "location": "AddShoppingItem.The_Product_Successfully_Added_To_Cart()"
});
formatter.result({
  "duration": 44994800,
  "status": "passed"
});
formatter.match({
  "location": "AddShoppingItem.Return_To_Cart()"
});
formatter.result({
  "duration": 2295390100,
  "status": "passed"
});
});