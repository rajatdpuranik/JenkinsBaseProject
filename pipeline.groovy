pipeline {
    agent any
    parameters {
        booleanParam(name: 'PARAM_2', defaultValue: false, description: 'Check to show PARAM_3')
        activeChoiceParam(name: 'PARAM_3', description: 'Select an option', groovyScript: """
            if (Boolean.valueOf(PARAM_2)) {
                return ['Option 1', 'Option 2', 'Option 3']
            } else {
                return []
            }
        """)
    }
    stages {
        stage('Build') {
            steps {
                // Build your project here, using the parameter values as needed
                sh 'echo "Step 1"'
            }
        }
    }
}
