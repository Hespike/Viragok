public class Bolt {
    static int viragRendeles(Csokor[] raktarkeszlet, int raktarDarab, Csokor[] rendeles, int rendelesDarab) {
        for (int i = 0; i < rendelesDarab; i++) {
            int talalt = 0;

            for (int j = 0; j < raktarDarab; j++) {
                if (rendeles[i].tipus == raktarkeszlet[j].tipus) {
                    if (rendeles[i].mennyiseg > raktarkeszlet[j].mennyiseg) {
                        return 0;
                    } else {
                        talalt = 1;
                    }
                }
            }

            if (talalt == 0) {
                return 0;
            }
        }

        return 1;
    }
}
