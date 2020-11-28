Feature: Gmail Website Testing

Scenario Outline: Validate UserId field

Given Launch website
When Enter userid like "<x>" value
And Click on UserID Next button
Then Validate userid output for "<x>" with "<y>" with "<z>" criteria
When close site 
Examples: 
|		    	x						  	|			y			|     z   |
|													|	Invalid		|   test1 |
|			dfvesfggrrffvgg    	|	Invalid		|   test2 |
| anisha.prasoon@gmail.com| 	Valid		|   test3 |

Scenario Outline: Validate password field
Given Launch website
When Enter userid like "anisha.prasoon@gmail.com" value
And Click on UserID Next button
When Enter password like "<a>" value 
And click on Password Next button
Then Validate password output with "<x>" with "<y>" criteria
Examples: 
|			x			| 		y			|
|						|	Invalid 	|
|	$cooby7890| Invalid		|
| $cooby1025|	Valid			|