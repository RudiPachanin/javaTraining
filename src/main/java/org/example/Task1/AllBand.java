package org.example.Task1;

import org.example.Task;
import org.example.TaskName;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Component
public class AllBand implements Task {

    @Override
    public void run() {
        MusicBand musicBand1 = new MusicBand("Metallica", 1981, Arrays.asList("Джеймс Хетфилд"));
        MusicBand musicBand2 = new MusicBand("AS/DS", 1973, Arrays.asList("Ангус Янг"));
        MusicBand musicBand3 = new MusicBand("The Beatles", 1960, Arrays.asList("Джон Леннон"));
        MusicBand musicBand4 = new MusicBand("Дюна", 1987, Arrays.asList("Виктор Рыбин"));
        MusicBand musicBand5 = new MusicBand("HI-FI", 1998, Arrays.asList("Митя Фомин"));
        MusicBand musicBand6 = new MusicBand("Ado", 2020, Arrays.asList("Ado"));
        MusicBand musicBand7 = new MusicBand("NRKTK", 2007, Arrays.asList("Евгений Горбунов"));
        List<MusicBand> musicBandList1 = new LinkedList<>();
        musicBandList1.add(musicBand1);
        musicBandList1.add(musicBand2);
        musicBandList1.add(musicBand3);
        musicBandList1.add(musicBand4);
        musicBandList1.add(musicBand5);
        musicBandList1.add(musicBand6);
        musicBandList1.add(musicBand7);
        List<MusicBand> musicBandList2 = new LinkedList<>();
        for (int i = 0; i < musicBandList1.size(); i++) {
            MusicBand musicBand = musicBandList1.get(i);
            if (musicBand.getYear() >= 2000) {
                musicBandList2.add(musicBand);
            }
        }
        System.out.println(musicBandList2);

        MusicBand.migration(musicBandList1.get(0), musicBandList1.get(1));
        System.out.println(musicBandList1);
    }

    @Override
    public TaskName returnName() {
        return TaskName.ALL_BAND;
    }
}
