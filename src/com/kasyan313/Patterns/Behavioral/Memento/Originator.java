package com.kasyan313.Patterns.Behavioral.Memento;

public class Originator {
    private String state;

    public Memento save() {
        return new Memento(state);
    }

    public class Memento {
        private String state;

        private Memento() {
        }

        private Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }
}
