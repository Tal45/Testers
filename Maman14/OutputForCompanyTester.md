	******Testing addRent method******
Successfully added: (expecting 1)
The company has 1 rents:
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500

Double-listing: (expecting false) false

Successfully added: (expecting 2)
The company has 2 rents:
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134

	*MIND THE ORDER!: Arthur > Tal > Thomas*

Successfully added: (expecting 3)
The company has 3 rents:
Name:Arthur From:02/07/2018 To:29/07/2018 Type:D Days:27 Price:5976
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134

	******Testing removeRent method******
Trying to remove non-existent rent: (false expected) => false

The company has 3 rents:
Name:Arthur From:02/07/2018 To:29/07/2018 Type:D Days:27 Price:5976
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134

Adding Arthur the II:
The company has 4 rents:
Name:Arthur From:02/07/2018 To:29/07/2018 Type:D Days:27 Price:5976
Name:Arthur the II From:27/07/2018 To:29/07/2018 Type:C Days:2 Price:360
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134

Trying to remove Arthur's rent: true
The company has 3 rents:
Name:Arthur the II From:27/07/2018 To:29/07/2018 Type:C Days:2 Price:360
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134

	******Testing getNumOfRents method******
Test Passed: returned; 3
Test Passed: returned; 4

	******Testing getSumOfPrices method******
Test Passed: returned; 7970

	******Testing getSumOfDays method******
Test Passed: returned; 41

	******Testing averageRent method******
Test Passed: returned; 10.25

	******Testing lastCarRent method******
Test Passed: returned; id:1000001 type:C brand:Citroen gear:auto

	******Testing longestRent method******
Expecting Arthur: Name:Arthur From:02/07/2018 To:29/07/2018 Type:D Days:27 Price:5976

	******Testing mostCommonRate method******
Test Passed: returned; C

	******Testing includes method******
Checking if new list c2:
The company has 2 rents:
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134
	included in c1:
The company has 4 rents:
Name:Arthur From:02/07/2018 To:29/07/2018 Type:D Days:27 Price:5976
Name:Arthur the II From:27/07/2018 To:29/07/2018 Type:C Days:2 Price:360
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134
Test Passed: returned; true

Setting c3 empty list:
C3 included in C1?: true; TEST PASSED
C3 included in C2?: true; TEST PASSED
C1 included in C3?: false; TEST PASSED

	******Testing merge method******
C3:
The company has 1 rents:
Name:Yankee From:02/07/2018 To:29/07/2018 Type:A Days:27 Price:2490

C1:
The company has 4 rents:
Name:Arthur From:02/07/2018 To:29/07/2018 Type:D Days:27 Price:5976
Name:Arthur the II From:27/07/2018 To:29/07/2018 Type:C Days:2 Price:360
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134

Merge C3 in C1:
The company has 5 rents:
Name:Yankee From:02/07/2018 To:29/07/2018 Type:A Days:27 Price:2490
Name:Arthur From:02/07/2018 To:29/07/2018 Type:D Days:27 Price:5976
Name:Arthur the II From:27/07/2018 To:29/07/2018 Type:C Days:2 Price:360
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134

	******Testing unifyRents method******
Expecting Tal to be united to a rent from 10/05 to 19/05:
The company has 6 rents:
Name:Yankee From:02/07/2018 To:29/07/2018 Type:A Days:27 Price:2490
Name:Arthur From:02/07/2018 To:29/07/2018 Type:D Days:27 Price:5976
Name:Arthur the II From:27/07/2018 To:29/07/2018 Type:C Days:2 Price:360
Name:Tal From:10/05/2022 To:15/05/2022 Type:A Days:5 Price:500
Name:Tal From:12/05/2022 To:19/05/2022 Type:A Days:7 Price:630
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134

After unifyRents method:
The company has 5 rents:
Name:Yankee From:02/07/2018 To:29/07/2018 Type:A Days:27 Price:2490
Name:Arthur From:02/07/2018 To:29/07/2018 Type:D Days:27 Price:5976
Name:Arthur the II From:27/07/2018 To:29/07/2018 Type:C Days:2 Price:360
Name:Tal From:10/05/2022 To:19/05/2022 Type:A Days:9 Price:830
Name:Thomas From:01/01/2023 To:08/01/2023 Type:C Days:7 Price:1134

	******Testing toString method******

	PAY CLOSE ATTENTION TO PRINTS

The company has 0 rents.

The company has 1 rents:
Name:Tal From:12/05/2022 To:19/05/2022 Type:A Days:7 Price:630

The company has 2 rents:
Name:Yaakov From:10/05/2022 To:15/05/2022 Type:D Days:5 Price:1200
Name:Tal From:12/05/2022 To:19/05/2022 Type:A Days:7 Price:630

The company has 3 rents:
Name:Dima From:02/07/2018 To:09/01/2023 Type:C Days:1652 Price:267624
Name:Yaakov From:10/05/2022 To:15/05/2022 Type:D Days:5 Price:1200
Name:Tal From:12/05/2022 To:19/05/2022 Type:A Days:7 Price:630

