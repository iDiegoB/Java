public class clase30 {
    public static void main(String[] args) {
        String[] nomRegiones = new String[]{"Tarapacá", "Antofagasta", "Coquimbo", "Vaparaíso", "O'Higgins", "El Bío Bío", "Los Lagos", "Aysén",
                "Magallanes y Antártica Chilena", "Región Metropolitana de Santiago", "Los Ríos", "Arica y Parinacota", "Ñuble"};


        int[][] alimentacionPorRegion = {{97479, 194958, 100000, 29972},
                {97479, 299667, 149833, 29972},
                {194958, 97479, 29972, 123833},
                {325678, 194958, 874342, 29972},
                {97479, 29972, 83723, 194958},
                {29972, 194958, 98345, 29972},
                {97479, 123833, 324567, 123833},
                {345456, 194958, 984532, 29972},
                {123833, 194958, 345456, 29972},
                {345456, 194958, 456328, 29972},
                {123833, 194958, 76453, 29972},
                {97479, 194958, 54245, 29972},
                {97479, 194958, 54245, 29972},
        };

        System.out.println(obtieneNombreRegionConMasVeganos(nomRegiones, alimentacionPorRegion));
        double[] result = porcentajeDeNoCarnivorosPorRegion(nomRegiones, alimentacionPorRegion);
        for (int i = 0; i < result.length; i++) {
            System.out.println("En la region de " +nomRegiones[i]+" el "+ result[i] + "% de su población es no carnivora ");
        }
        String [] alimentacion = {"vegetarianos", "carnivoros", "veganos", " basada en plantas"};
        System.out.println("El porcentaje de alimentacion "+ alimentacion[3]+ " para la region de "+ nomRegiones[5-1]+" es "+ porcentajeDeTipoDeAlimentacionPorRegion(nomRegiones,alimentacionPorRegion,3,5));

    }

    public static String obtieneNombreRegionConMasVeganos(String[] nomRegiones, int[][] alimentacionPorRegion) {
        int comparador = 0;
        int region = 0;
        for (int i = 0; i < alimentacionPorRegion.length; i++) {
            if (comparador < alimentacionPorRegion[i][2]) {
                comparador = alimentacionPorRegion[i][2];
                region = i;
            }
        }
        return nomRegiones[region];
    }

    public static double[] porcentajeDeNoCarnivorosPorRegion(String[] nomRegiones, int[][] alimentacionPorRegion) {
        double[] result = new double[nomRegiones.length];
        int sumaTotal = 0;
        int noCarnivoros = 0;
        for (int i = 0; i < alimentacionPorRegion.length; i++) {
            for (int j = 0; j < alimentacionPorRegion[0].length; j++) {
                sumaTotal += alimentacionPorRegion[i][j];
                if (j != 1) {
                    noCarnivoros += alimentacionPorRegion[i][j];
                }
            }
            result[i] = (double) (noCarnivoros * 100) / sumaTotal;
            sumaTotal = 0;
            noCarnivoros = 0;
        }
        return result;
    }

    public static double porcentajeDeTipoDeAlimentacionPorRegion(String[] nomRegiones, int[][] alimentacionPorRegion, int alimentacion, int region) {
        int sumaTotal = 0;
        int cantidadAlimentacion = 0;
        for (int j = 0; j < alimentacionPorRegion[0].length; j++) {
            sumaTotal += alimentacionPorRegion[region-1][j];
            cantidadAlimentacion = alimentacionPorRegion[region-1][alimentacion-1];
        }

        return (double) ((cantidadAlimentacion * 100) / sumaTotal);
    }
}