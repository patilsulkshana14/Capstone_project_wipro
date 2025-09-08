Feature: Open registration page

Scenario Outline: Check for valid registration credentials
  Given registration page should be open in default browser
  When user registers with "<FirstName>" "<LastName>" "<Email>" "<Telephone>" "<Password>" "<ConfirmPassword>"
  Then registration successfully

Examples:
| FirstName | LastName | Email              | Telephone  | Password  | ConfirmPassword |
| Sau       | Ps        | pss123@gmail.com     | 9876543210 | Pass@123  | Pass@123        |
| Disha     | D        | d321@gmail.com     | 9763060269 | Pass@456  | Pass@456        |
