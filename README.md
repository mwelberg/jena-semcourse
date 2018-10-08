# jena-semcourse
Semcourse is a semantic web application developed to organize and distribute teaching material and universtiy knowlegde from professors to students and from students to students.
Multiple components (triple store, web application, etc.) are needed to organize and distribute knowledge, jena-semcourse will control these components and their interactions. 
# Components/Hierarchy
<pre>
jena-semcourse
- Model
-- TripleStore
-- FileStore
-- Tagging
-- Search
-- SpringLDAP
- View
-- WebApp
--- AuthenticationView
--- OntologyView
--- DocumentView
--- ProfileView
--- AdminView
- Controller
-- AuthenticationController
-- OntologyController
-- DocumentController
-- ProfileController
-- AdminController
</pre>

