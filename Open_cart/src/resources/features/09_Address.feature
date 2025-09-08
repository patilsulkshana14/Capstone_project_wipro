Feature: Open home page

Scenario Outline: Check for checkout process
  Given open Shipping page in default browser
  When update Shipping details "<FirstName>" "<LastName>" "<Address>" "<Zip>" "<Country>" "<State>"
  Then Shipping done successfully

Examples:
| FirstName | LastName | Address | Zip    | Country | State       |
| Sulkshana | P        | Pune    | 424308 | India   | Maharashtra |
| Rohan     | K        | Mumbai  | 400001 | India   | Delhi       |
