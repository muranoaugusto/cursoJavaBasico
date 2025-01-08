package projects.e123.enum123;

public enum WorkerLevel {
 
        JUNIOR(1),
        MD_LEVEL(2),
        SENIOR(3);
    
        private int workercode; // Campo para armazenar o valor inteiro
    
        // Construtor para inicializar o valor associado
        WorkerLevel(int workercode) {
            this.workercode = workercode;
        }
    
        // Método para obter o valor associado
        public int getWorkerCode() {
            return workercode;
        }
    
        // Método para buscar o enum pelo valor inteiro
        public static WorkerLevel fromCode(int workercode) {
            for (WorkerLevel level : values()) {
                if (level.getWorkerCode() == workercode) {
                    return level;    
                }
            }
            throw new IllegalArgumentException("Código inválido: " + workercode);
        }
    }
    