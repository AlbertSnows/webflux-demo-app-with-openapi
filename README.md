# Reactive FSM

A spring boot state machine to test reactive programming. 


## Note on building

This project depends on lombok; specifically stuff that's generated under the build folder. As such, before you can run this locally with gradle you'll likely need to build the project successfully before it'll run, and make sure those gen files are there. 

IMPORTANT: To run this, if you use clean, it'll remove the
`generate-resources` build folder which is where these files
that this depends on are generated. To run this project
you need to do `clean -> openApiGenerate -> build`. 
.dependsOn may fix this, but not 100% sure. 