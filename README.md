# jena-semcourse
Semcourse is a semantic web application developed to organize and distribute teaching material and universtiy knowlegde from professors to students and from students to students.
Multiple components (triple store, web application, etc.) are needed to organize and distribute knowledge, jena-semcourse will control these components and their interactions. 
# Components/Hierarchy
<pre>
jena-semcourse
- src
-- main
--- java
---- webapp
----- model
------ DocumentStore
------ JobStore
------ OntologyRelationStore
----- controller
------ AuthenticationController
------ GraphController
------ DocumentController
------ [ProfileController]
------ AdminController
------ SearchController
------ LdapController
------ [SchedulerController]
---- jena
----- model
------ TripleStore
----- controller
------ TaggingController
--- resources
---- AuthenticationView
---- GraphView
---- DocumentView
---- [ProfileView]
---- AdminView
</pre>

