/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {
      public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constantes
        final double CUOTA_MIN = 0;
        final double CUOTA_MAX = 30;

        // Generar dato cuota Netflix, cuanto pagará 1 (aleatorio) y 2 resto.
        double cuotaNetflix = 30;
        double cuotaA = RND.nextDouble()*(CUOTA_MAX - CUOTA_MIN) + CUOTA_MIN;
        double cuotaB = cuotaNetflix - cuotaA;
            System.out.printf("La cuota total de Netflix es de %.1f€.%n", cuotaNetflix);
            System.out.printf("Un amigo ha pagado ....: %.1f€.%n", cuotaA);
            System.out.printf("El otro amigo ha pagado ....: %.1f€.%n", cuotaB);
       }
}
