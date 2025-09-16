public List<Libro> buscarLibro(CriterioBusqueda criterio) {
    List<Libro> resultados = new ArrayList<>();
for (Libro libro : this.listaDeLibros) {
        if (libro.getTitulo().equalsIgnoreCase(criterio.getTitulo())) {
            resultados.add(libro);
        }
    }
    return resultados;
