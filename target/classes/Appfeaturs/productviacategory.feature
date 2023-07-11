Feature: Product via category after applying multiple filters

	Scenario: Access a Product via category after applying multiple filters

	Given go to  www.ebay.com website
	When Navigate to Search by category > Electronics > Cell Phones & accessories
	And After the page loads, click Cell Phones & Smartphones in the left hand sidenavigation section.
	And Now, click – See All (appears under “Shop by brand” or “Shop by Network”).
	And Add 3 filters - screen size, Price and Item location appearing in the pop-up andclick apply.
	And Verify that the filter tags are applied.
	Then quit the browser

