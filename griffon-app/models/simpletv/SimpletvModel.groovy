package simpletv

import ca.odell.glazedlists.BasicEventList
import ca.odell.glazedlists.SortedList


class SimpletvModel {
    @Bindable String username
    @Bindable String password
    @Bindable ProgressBarPct downloadPct = new ProgressBarPct()
    @Bindable Integer selectedDvrIndex
    Integer selectedEpisodeIndex
    Integer selectedUrlIndex
    Integer selectedShowIndex
    Integer selectedBatchShowIndex
    @Bindable ProgressBarPct batchPct = new ProgressBarPct()
    @Bindable ProgressBarPct allEpisodesPct = new ProgressBarPct()
    @Bindable String status
    @Bindable String saveLocation
    @Bindable Boolean useLocalUrl = true
    @Bindable String postCommand


    @Bindable Boolean userNameEnabled = true
    @Bindable Boolean passwordEnabled = true
    @Bindable Boolean loginBtnEnabled = true

    @Bindable Boolean showListEnabled = true
    @Bindable Boolean episodeListEnabled = true
    @Bindable Boolean qualityListEnabled = true
    @Bindable Boolean downloadBtnEnabled = false

    @Bindable Boolean batchShowListEnabled = true
    @Bindable Boolean postCommandEnabled = true
    @Bindable Boolean downloadAllEnabled = false

    Boolean connected = false


    SortedList<Dvr> dvrs = new SortedList(new BasicEventList(), {a,b -> a.name.toLowerCase() <=> b.name.toLowerCase()} as Comparator)
    SortedList<Show> shows = new SortedList(new BasicEventList(), {a,b -> a.name.toLowerCase() <=> b.name.toLowerCase()} as Comparator)
    SortedList<Episode> episodes = new SortedList(new BasicEventList(), {a,b -> (a.season <=> b.season ?: a.episode <=> b.episode)} as Comparator)
    SortedList<EpisodeUrl> episodeUrls = new SortedList(new BasicEventList(), {a,b -> a.toString() <=> b.toString()} as Comparator)

}