package org.example.DispositivosElectronicos;

public class DispositivoElectronico implements Reproducible, Conectable{
    @Override
    public void conectar() {
        System.out.println("Conectando....");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando....");
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo....");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando....");

    }

    @Override
    public void detener() {
        System.out.println("Detener....");

    }
}
