package br.com.alura.screenmatch.service;

public interface iConveteDados {
   <T> T obterDados(String json,Class<T> classe);
}
