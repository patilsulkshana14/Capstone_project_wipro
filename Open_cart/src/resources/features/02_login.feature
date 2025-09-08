Feature: Open login page

Scenario Outline: Check for valid login credentials
  Given login page should be open in default browser
  When user logs in with "<Email>" and "<Password>"
  Then login successfully

Examples:
| Email              | Password     |
| pss123@gmail.com  | Pass@123 |

