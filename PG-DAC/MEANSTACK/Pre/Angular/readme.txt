Angular:
	1. Components
	2. Templates
	3. Directives
	4. Services

Building Blocks:
	
	- One or More Components
		-Data
		-HTML Template		
		-Business Logic
			E.g Website Has
				-Side Bar As Componets
				-Navbar As Components
				-Courses As Components
					- One or More Courses (Courses Divided in Smaller Component)
						-Each Course has Rating as Sub-Components 
						(Reused for Other Courses Too)


	- Every App has App or Root Component
	- Each Components Linked to This Root Component (Represented as Tree)

	- Module has Group of Related Component
	- Each App has atleast one Module (Named as App)
		E.g LMS Website has
			-Courses Module
			-Messaging Module
			-Instructor Module
			-Admin Module
	- Each App module divided into smaller module;


//Get Started
	Components
		- Create
		- Register it in a Module
		- Add an element in an HTML Markup
	Decorator
		//Convert Class to Component using decorator (component)
		//Make Class a Component
