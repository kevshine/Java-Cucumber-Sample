Feature: Feed cookie monster 
	We should feed the Cookie monster and he should tell us when he is full 
	
Scenario: Cookie monster needs more cookies 
	Given cookie monster can eat 9 cookies and he has 0 cookies in his belly 
	When cookie monster eats 1 cookie
	Then cookie monster says "Yum Yum give me more cookies!"