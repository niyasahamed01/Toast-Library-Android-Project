**Show message**

**Step 1.** Add it in your root build.gradle at the end of repositories:

	dependencyResolutionManagement {

		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven {
            		url = uri("https://jitpack.io")
        		      }
			}
   
	}
 
**Step 2.** Add the dependency

        
	dependencies {

	        implementation 'com.github.niyasahamed01:ToastApp:1.0'
	 
	}

