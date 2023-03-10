pipeline {
    agent any
    parameters {
        string(name: 'PARAM_1', defaultValue: 'default_value', description: 'Description of parameter 1')
        booleanParam(name: 'PARAM_2', defaultValue: false, description: 'Description of parameter 2')
        choice(name: 'PARAM_3', choices: ['Option 1', 'Option 2', 'Option 3'], description: 'Description of parameter 3')
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
