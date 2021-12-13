package DayEight;

import java.util.Arrays;
import java.util.HashMap;

public class SevenSegment2 {
    public static void main(String[] args) {
        SevenSegment2 sevenSegment = new SevenSegment2();
        sevenSegment.getCleanInputKeys(sevenSegment.rawInput);
        sevenSegment.getCleanInputCodes(sevenSegment.rawInput);
        int uitkomst = 0;

        for (int x = 0; x < sevenSegment.cleanInputCodes.length; x++) {
            int[] distribution = sevenSegment.findDistribution(sevenSegment.cleanInputKeys[x]);
            HashMap<Character, Character> sleutel = new HashMap<>();
            String four = sevenSegment.findEncodedFour(sevenSegment.cleanInputKeys[x]); //We moeten eigenlijk alleen de 4 weten om de rest te beredeneren.
            sevenSegment.findEasySegments(distribution, sleutel);
            sevenSegment.findHardSegments(distribution, sleutel, four);
            System.out.println(sevenSegment.decode(sevenSegment.cleanInputCodes[x], sleutel));
            uitkomst = uitkomst + sevenSegment.decode(sevenSegment.cleanInputCodes[x], sleutel);
        }

        System.out.println(uitkomst);


    }

    String[] rawInput = {"dcbgefa cebd bfega eadbf db cdfaeb dba bfcgda egadcf aedcf", "egadcfb eafcd db debc",
            "dfea ea abe dfgaeb fdcgba badeg dcfbeag dbgaf bcged fcebag", "gfadb dfagb fdgabe eagdbf",
            "cd gfcde cdbfage cbdfae edc fedgac gadc feagd febdga gbfec", "adbfeg dbfcae facbde gcfde",
            "ecafb abgfc deacbgf fe fbe fgec edgafb cgbafd ebfgca ebcad", "cfbae fbcga dfabceg ceabf",
            "eagfcd abfdecg fe fdae egf cfgda gcedb dcgabf bcegaf cegdf", "gcfda feg efg cadgbf",
            "gfcdab efadc cadbgfe beca badfce ecfbd edcagf gbdef cfb bc", "gdecbfa cbea gedbf aceb",
            "cgafb abgcde debfca ecafgd ecdag bcd dacbgfe gebd db cabgd", "cfdaeg dcfeag cbgda agfcb",
            "cegba dg gbd feabgd fdecgb gbced fdbcae dfcg fbced gdceafb", "gfecdab dbg dg fdceabg",
            "cebgdaf gbfaec cebg fbcag bac efagb cgdaf fcbade fgadeb cb", "abcgf fdeabg dbafge cadgf",
            "aefdg ga becfagd dag gfdbe bgeacd dgaefb caefd cfebdg bafg", "gda afegdb afdce efacd",
            "dfacgb afegc cbfgae dceg gcafbde dfabe gadef gd cfegda adg", "bcafeg efadb efbda cgefa",
            "gbfae cbgf ceg dgefba cafde bcagde dbfaegc gefca egcfba cg", "abefg agfbe cafgeb fgeadbc",
            "cabef ecdfbg gceabf facg dbage ecfabd eagbfcd gc gbc eabcg", "bfedcg cfbgde acebg bcfadeg",
            "bcedagf abecf cdaebf gacb dgfec gaf gebafc bgfdea ag cefga", "egfac dfcbea agf deacbf",
            "febagcd bfgcae fecab abcfde dgbec da fadebg ade adbce dfca", "gbefdca aedfgb adebgf cbdge",
            "acb fgadc ebaf efdbgc ab dbgaec caegbfd fdcbe abcedf cfdba", "ecdfb bfdcea ebcdga cedfb",
            "cbaeg befda bdagfe gd dga dgbae deacgf fbgdeac dfbg decbfa", "gecafd gad ceagb debaf",
            "egd de bfadeg gcfbe gdbcafe bgfeca cedgfb cdagf edgcf bedc", "cefgd ecgafb edg ged",
            "aebfgc bgf bcag fceabd gcdef becdafg befac gb fcegb badegf", "ebfdga cgba gabecf cfedba",
            "abgdfe gafdc fdb egbdfca cgbaef edba egfba cgefdb bd agdfb", "dfb fgdca cgafd fgdba",
            "agfeb dgafb agfecb gfcaed abegc febc ef fea ebfcdga bedagc", "ebcadg eaf bafge gcaeb",
            "ba febcag gfbec fcab bgfecd dgeaf eacbdg fagedcb efgab abg", "egfdbc geabcd cegbf ecfbgd",
            "fage egacd cdagb dcefag gcedfb efgcd cedgfba fdcbea dae ea", "ae aed gfedbc faeg",
            "gefac cbe cb fgacdeb bceadg agfebc fedgca abfc egcfb ebdfg", "egbfc fbdeg aefdcg gcbfe",
            "agbfce edbga agfde cfage afcged bgfcde bcagedf cdaf fdg df", "bdcegaf dgefa eadgb fcgdae",
            "acebg ce bcadg gcedfb ebc bfeag degfba acfe bacdgef baefgc", "aebdfg abgfe abecgf cgabd",
            "bgafd dgbae dbcfae acfegd bcfg cgafd fdbgca fb dcbgafe bfa", "afdbg baf bfgc bf",
            "daebcf fcdgbe egfab gaedb da agcdbe dagc adebfcg bda cgbde", "gfabe gdecab eabdg cdgbfae",
            "decbga bdac da cgdfe ebacg agbfce cagde fecbagd gda dfegba", "da fcedg fcdge dga",
            "dfecba fbc gceab ebfg acdegb bf afdebgc befagc cgdfa bgfac", "baecgd gacfbe bf cfagb",
            "bgefca agcbf dfgceab bcedfa ebafg fdgae feb dcgabf gebc be", "agbfe be becfga gcbafe",
            "cbgaed gb dgb defcg gdfeb ecafgd dbgfce bcfg facegbd deabf", "gdcef adgbec egdfb acgefd",
            "bcead bdecag adbfec gda gabe febgcda ag caedg gabdfc efcdg", "ebag ageb cedafb edbca",
            "bg cdbga ebcg adgfeb dagbefc dbg caedg cgfdae acfdb geadbc", "cabdf gbce bacdeg dabegf",
            "fecdgab bd gfcade agedf cafbg cagdbe adbgf gbd efbgad efbd", "egafdc gfdea bfaedcg gabedc",
            "cfdgbe cgaeb edab gacde ebg be edcagbf edcgaf abfcg adcgbe", "gafbc gcbaf adgbec be",
            "geb bdfg abced fdbaeg gdafe gfdecba bg gcedaf bdage ebfgca", "cgefda egdbaf gdcfae eagdb",
            "cafbge cfdgb abfce aedfbg cade de beafcgd cdbef dbcfae def", "dfbaec cfdbe gcaefb dgbfc",
            "bafce bcage ebcagfd fc decbfa bdcf fdaeb acdegf efc egbadf", "aefbd abegc eabdf bfdea",
            "gc dfeacg ebfacdg ebcdfa bdfac gbcda fbcg dafbcg cag bdega", "dcabfe cbfg fabdc gcfb",
            "fdaeb agbfe ecadbg efdacgb dbf debac cdaf dgcfbe dacbfe fd", "abdfe gfeab fdac dfb",
            "cbfdg adgcb gfebc gedabc bdf df agcfbd dgaf gfdebac ecadbf", "fcgbd bgdca adbfgc gfad",
            "bgf aefbg fgdcab ecbfadg eagbc bgedac fbec fgabec fb egadf", "bfec afged ebfc gefad",
            "cgafdbe fedgab gafde adbg gebcfd efcag bcdfae fdg fdeba gd", "fgabedc dg cegaf cfbaed",
            "bfecagd gcfdb ce fgabed gbeafc ecdbf bce deca acfdeb beadf", "bce agfecb gedbaf dfbec",
            "dfb abcfge fdbage acefd cgbd db gefbc bcdfe acdgfbe gbdcfe", "fcdbe fdecgb fgcbe fceda",
            "efdac gacbed cafeb fcgd fdaeg cd gebdfa fdbagec ecd dacfeg", "edafcg deacgf eadcgb dgfc",
            "degabc egc cegfa gdefa gafbc ce cfed cagedfb aefgdc eafdgb", "gdfeab agfcb gebfda fadge",
            "aegbdc dbgfec begac ef fdgca efc gacebf eafgc bafe edcfbga", "acfeg bfgeca cef befa",
            "cfegdba bdage bgc faceb cbafge bdefca gdfabc caebg gc gefc", "cfbead cg cg eafbc",
            "db bdaegf abd debgfac feacb edafg dfbcga dafeb agdefc debg", "eafcb bafed dafgbe edfba",
            "dbegac efdcg ecdgfa geafc fabgdec efcab gfad ag ega dcebfg", "defgacb efgcbd dagf fgad",
            "dafbe bdfgae cd cadfe ecfdab bcdefag gface dcfb acd cbegad", "efabd dcbf decfbga dbgeaf",
            "ca gfbdc eadcfgb cfgade efac afdeg dcgaeb dgfabe gca gdfac", "dacbeg gcefda cfdbg geabfd",
            "fbecag fdaegc gfade edcafgb ecf cfabd ecdfa gcde deafbg ce", "ebfcga aecfbg cef abgcfe",
            "eadcbg ecd gdebf fgeac cd dcfb fecdg fdgaecb cdfebg afebgd", "gdfec adefbgc febgcd bgfadec",
            "egfdca bfceg cfg cgabfe bfged bcadeg agebdcf cf bacf agbec", "defgb cgbfade beagcf fgaceb",
            "ebdga efabgc abcfdeg fe gfabcd dcfag fgaed ceafgd fge cfde", "acbefgd agecfd edafg gadfcb",
            "eadgc edagbf fbgd fadbce bg ebg ebdfa cfedabg cbfgea ebgad", "aedbg egfdab cedbfa aecbfg",
            "gd cefga cdabfge dgfce afbdgc dacfbe fgdebc cdg cbedf gebd", "dg febdcga bedg gd",
            "gedfb bcfgde cbfde cebg egf adbcef edgcaf cgdeabf eg gafbd", "gdbef abecfd ge feg",
            "bdacfg cba ab gcdefa cdbeg acgef egcfbda gafebc abfe caegb", "cafeg bgcea gface agbec",
            "fcabdge gdceab bdgcf ecfdb cgd cgef gc cfebdg dgfab adbfec", "dgc gdcfbe gc fegc",
            "cgbd gefbdc cdfeg gaecdf gfbedac cebdf faecb dbf db gedfab", "cbdef bdf ebacgdf ecbfd",
            "fdecbg bagcef beagc dbgfaec edagbc dgafb eafgb efg ef acfe", "cgfaeb ceaf dbcgea gfbae",
            "cfdae cefg acf bcaedg aecdg eadbgfc fc dbafe bfadgc defcag", "efgc cfa ceadbg cfa",
            "egc bgadef fcbdg cgdfe cdafge ce gadebc begcdfa faedg efca", "efadg cdeafg cgfdb faegdb",
            "ed agdbc bedcg cfageb edfb fgbdec ged dfaceg aedcgfb gfceb", "de debf agdcb fdgaec",
            "beadgfc bc fabc cbeda dbefa cfbead ecfgbd cbe dgeca ebagfd", "dceba edcafb cadgbfe daceb",
            "dgbcef afdbc fgdaeb ef edf edcgb eabcdg gbacfde cefg cfedb", "ebfcd gbfedc bafcd ef",
            "fecgb gbcfad aebdgc cgbaf cfedag gbcad afg fa afdb cafedgb", "afdcge gdbacf acgdb gcdaeb",
            "abd cfeadbg agedbf ba fdaeb fbga fcdae dabgce fcebdg edfbg", "dfegcb dcebgf befdcg bfade",
            "gbacfed gdbce gdaec fcedag eb cgfdb adbe ecb eadgcb fegcba", "acebdg egbfac dcafge fbdgc",
            "fbea fa acgbdf bdcgfe deacg daf fbged ceagbfd fgade gedfab", "bcgfaed af af dfa",
            "fedbgc dfgea gbdefa bagd egacbdf bceaf aegbf gb ecdgaf bgf", "bg caedfg aefgdbc bfg",
            "dabcgfe dbfce cgeda adcbe bgaced eab gadb fdgcea ba bcefga", "cdbae ba cfaedg cdaeg",
            "bed bagedc agebd feagcd edcga bdac bgfaedc fbega gebdfc db", "debcfg cagbde egadc dceag",
            "afgcb agef badcf ebfagc befcgd gfb fg fdagbec gbcea gecbda", "gdcfeb bdfceg cdfba cegfdb",
            "cdbegf abgfedc geabcf dgefa fc cagdbe cfe fagce cfab gabce", "cfba acfb cf bagfedc",
            "ecbga abedgc fce gbacfe aecdgbf afcb eagcf cgefdb fc adefg", "afdeg dcfabeg bfca gdacbef",
            "cedfg gaedb befcadg gaced cadfeg cabdfg ac adc befdcg ecfa", "egbad cafgbd egfdcb dgecf",
            "agbc cegda bdecfa edgfb gdbace adb ab bgfdace gcdefa ebdag", "abedg ba gbdae geacd",
            "cefbg gaed gadfb gfabdce egfdb edagbf ed dgbacf deb dfebca", "ebd cefadgb ecfbgad bdacfg",
            "ea adbfc defcgba eafb dgfbac edacbf fdcge ace fadec aedgbc", "ea cfdea bagdce fdegc",
            "cedfg cea dfabecg efgcab fcgea agbfcd feab facbg ae gadebc", "bafgcd ea cdbeag gcafb",
            "bgcd cb dfbac dcagefb gdcfab acefgb cbf acgfd adfegc bfaed", "cbfgad fgacd cfdba gcbd",
            "gebcfda dabcg bgdaef dgc cg gfbad eacdb fgbc cgfdba gfadce", "agdfb befdag gcd dbagf",
            "cbedgf fcg degacf agcdbe dbcaf gbdec dgbcf bgef fg fbadegc", "gadefc adcbf acdbf fbcda",
            "egadf agf dcga cbfedg ceafgb ga cdfaeg dafbe bacfedg ecgfd", "feadbcg gcad agf fbead",
            "agcbfd cdbge afecdg adfe gafce agd facgedb da cdega feagbc", "faegbc gdcbfea cegfa cbfeag",
            "egc bfcdea gbfe afcgeb ge aebcf adgcf adgcfeb dabgce agecf", "cgabde cegaf fcaeg gfceba",
            "bceda bea fdgcae eb eafcgbd egadc fcageb dbacge bdeg bcafd", "bcfad edacb cgefda bgfaec",
            "fgabd bdgefa cagdf gfb fbaceg efdb cbagde fb afgedcb edagb", "gdfca gadeb agfdc ecdbga",
            "ab gafdbc ceafg dgaecfb feagcb efcdag dbefg caeb baf efgba", "abf abf agecbf fedgb",
            "gbdface gbadce gaedc cfagbd cbdga eda ed gcfae bgfead decb", "cbed fbdcage dbgac acbegd",
            "fcda ecgbdf df abefd ceafbd cfageb dageb cabef dfe edacgfb", "gedba eabgfc fd acgbef",
            "dg egbafc fdbaecg decg fedab agcfdb cbgea cegadb egdba bdg", "dg gaebc cdeg gedab",
            "fcbd db adfgc fdbgca gaefb bcfadge dfgab bda dcebag gacfed", "geadfc bd adb bfagdce",
            "ecdgb beagc gbcedaf dcbgfe bgfadc faebc ag acgdbe egda cga", "gceab eadg gaed dacgbf",
            "degcbfa febdgc egca cgd dbcga gaefdb bdgae cabdf cg dbeacg", "dcbgef deagbc baegcd acgdb",
            "fbc gfdeba gbefca deafb decbaf agdcf cb cfdab edbc dcegafb", "abgfed dfbca bcdfea dabfe",
            "de gdefacb becdag begac eabfgc ebdc edg aedfbg cfagd caged", "bcgfea deagcb bced cbed",
            "bafc gbafed gfb fgaebc fb aegcf fcbaged afecgd befcg cbegd", "gfaec fbagce agfedb cgebaf",
            "edcgab dgfb dagef bcfgae fg eabdfg defca degba efg cgdbafe", "bdage gdbea bfgcdea aegfdb",
            "ceafg fca fcabge cgedf dbfacg af fgbcade cedgab abceg feab", "eacgf fbcgda fca fdcgabe",
            "gfacd gcbd afdbgc bafecg bc eabdf abc acdefg aegfcdb bfdca", "bafcegd facbd bca cdgb",
            "bdafge edfgcb cdf becf fgbdca efdgb egacd fc ecgdabf degfc", "egabdf dbefga cafbedg fgcdeb",
            "bd bcfagde fadb efbdc cedfab aecdgb eadfc bdc cgfbe gfdcae", "dfab cbfeg bd efdca",
            "cf gcfdab bgfadce cadegb adecgf fcd eacf eagdc fgedc fbged", "gedbacf ecgad dfabgce degac",
            "afbceg fge fe becga cfae febgdca fdgab fcbgde bcaegd baegf", "baegf ef degcfb eacbg",
            "gae cfgadbe feagc adgf adfbce fdcgea ga beagdc feadc gcebf", "adfg eag edfca ga",
            "ecdb cd cfadbe febadg agecbdf dfbae cfabg dcf afdbc aefdgc", "dabfce adfbce cebd cdf",
            "dcebaf ebdac ged bdag bfceg bdeagc bcdge ebdcagf dg gcfade", "bdga fcegb gfcaedb gbedc",
            "fcdeagb cgbd cgf abdfge cdfagb afbdg bafce bgcfa defcag cg", "cgf cfdgea fdagce gfabc",
            "becdgf gd bgfdca gfd dabcef gefca adbg facebdg afdgc bcdaf", "acbdef dfacg dgf edgabcf",
            "fbaegcd egcfa faebc cdabf efdb fabcgd cbe daecgb bcadfe eb", "eb fgadcb dabfc dgceba",
            "decafb cabfd fg ebcdfg facgd dagec fgba fbcedag gcf gacbdf", "cadbf gedfcba fbacd cabfd",
            "dgface dfabe dfaeg fg gdbeca fge gcdea gfceabd fcga efbgcd", "becdga bcagde fagdec afcg",
            "ceadb gdefbc cegdbaf adc bfdea cebdag acgb ca gcafed cbdeg", "dac bcedag cbeda cabg",
            "fdb dcgfaeb bgadef fbcdg bdce afcbg bd gfeadc dfgec fdgecb", "bcagf bdaecfg ecfgadb bfd",
            "gdefa bg egcafdb egbafd dbfegc afgb ecfgda abedc dbg dabeg", "fdegbc eadgf afdeg gb",
            "bfcad bag gbec agedc agfdceb gb fdagbe begdac gefacd gbcda", "acfbd gba dcbag abcdf",
            "aeg bdcega ge fgcda bdcae afegbd ecdga ecabdf egbc dbeagfc", "ecabd edcbga agbfdec afdbeg",
            "fgdce deca agfedc bdfeagc bdcfag eagfb dga cgdfeb adfge ad", "gacedf agbfe aegdf fcegda",
            "bafg ecfbag cabfe cadfeg fedcb eabcgd cagfebd agebc af fae", "aegdbc afgedc feacb fa",
            "bcgdfe cabg cfaedb gc cfg efbdagc fagdc eagdf fcadb dbagfc", "cfgdeba efcgbd bcadf dgeaf",
            "feadcbg egfba fg begfdc gafd debfa geabc bfaegd gfb ecbfad", "cbagedf ecdbfag dfebcg gf",
            "ea gbdeca egbdc bdcea aebg cbadf fdeacg cedgfb cedfgba aec", "ceabd gbdaec ebag fadecg",
            "bedca dcbaef dfcb feb baecdg gbacfde afegc bf ebfac ebfadg", "ebdca gcdbea fbe geacf",
            "bafgcd dcb cgead dcgbef afcbg db adcgebf bdfa gbecfa bcadg", "gcbadfe agbdc gbafc bcd",
            "cg cga edcfab ceadbg acdgfe gfcd gafce eafcd egfab dfbgeac", "efagc bfeagdc fdebac aedbfc",
            "ebg dafeb cdabg agdcbe geafdcb agec gfdbce bgdfac eg gebda", "ebgad ge bceadg dbfea",
            "cfdeg acebdg abcfdg befdg bgf beadg fcbgade fabged abef fb", "decgf bfae fcdge fgdeba",
            "gdfeab feadc abgc ebgdcf dcgbaf acfdb ba bafcdeg gdbcf bfa", "cbdfa fbegda gadebf afdec",
            "bfecdg dbf fgbce gdefba dbec gbfeac db cgdaf gbdcf agfdbec", "febcg gcbdf eafdgb bfgec",
            "caebg gdcfa fedcabg dce dafe cfbdag de egdac fgbced gecadf", "fcgebda cgfad edc gbdcefa",
            "edcgab dcfeabg dfbga afbdcg bdfe egfab deafbg egb eb feagc", "badfeg bcgead eb abfdg",
            "bc geacbf gebca bdgafe fbceda bce dfacegb degca cbgf abgef", "bgacedf bcega gafdeb cgabe",
            "gfdcaeb ceagf cgf dcag efcbdg ecadf cg efbag gdfaec bdfaec", "eafgc cafeg gc dgcbfe",
            "fdgcab bdgfc dcfgeab daefgc fgbdea bfgec gdb db cbad fadcg", "gdb bgd dfcag bgaecdf",
            "ebca fagedc cb bcefgd cefda acbfd deacfb bcf bafdg ecgfabd", "cagedf fadec fdcae fdeca",
            "dgacef deacb dac afgdecb fdcaeb dabeg acbf bedcgf ca debfc", "bedag fgdcea acdbe bgead",
            "bdcaef cdegfa egfdba cfd bfec egfbacd cfdba fc cgabd bafed", "daebf bdacg cbfdgea bcdfa",
            "ac cab ebgfa fcedb cbedgf dbcfea gbdfeca ecafb fcda gedbac", "baefg ca ca bdcfe",
            "afcbge fedbca fagebdc abdce dacegb aefd fcdbg fa cfa cabdf", "af af beagfc abecd",
            "edacg afdgce fcagedb degcb deb db faegbd abdgce bacd gfbec", "egcdb dabc dabcge edb",
            "cgdab efabdgc bae bacefg efgbc fcea fbcdeg bgeac ea aebfgd", "ae cbgae dbfeag fcegb",
            "acfed eg dgae fbceda gce dgface ebafgc fgdcb cedgf fdgcbea", "fbcdg fdcaeb caegdfb cgabfe",
            "dcgab cae ae eabgc gedfca defcgb fedacbg efbgc bfea eacgbf", "cgdab ebaf bdcgfe eac",
            "gafbced ceadfg gabfc ae cgbfae febcd cefba cfgadb bgea ace", "fbdce eca bgafc afgdcb",
            "bgd edfab acgfbd dg gdac dbfga bcgfa gdbcafe bdcefg ebfgca", "abedf dafgb abgfce fagbec",
            "adbegf bgace gdfae afc fbcaed gcdf cf faecgdb gaefc cdaefg", "cfa ceafg abdcfe agefdb",
            "fdgcb adg cbefdg cbfadg adgcb dcfage ga cgbfdea bfag aedbc", "gdfcea fecdgb acbgd bgdfc",
            "febgdc gb fbecd fbg cgeabf agfed bdfeg bedcaf fcgdaeb gdcb", "febgd cfabed cedbf bdfge",
            "dbgcf dfg dgcafb bdcag df efdacg dcabeg facegdb adfb gbfce", "fgcdb dcfgb agbdcef gbcef",
            "abfdcg gbfea ceabgdf gedcbf ec bec cgfdb bgfce ecdf acgebd", "cagdfb ebc dfgceb ce",
            "bdafc fbaeg dcagfb cgdb adg dg daefbc bdgaf dacfebg efadcg", "dbgc bcfad aegfb adbcf",
            "cdagfe cdegb dbe defcg gabec gfdcbae bd efbdgc bcadfe dbfg", "eacfgd db db dbe",
            "fbcegd bdfgc cf gbecafd gdcba fbc fgdeb cdef gadbfe acbefg", "gdbfe gadfeb dbgfc bdfgec",
            "abcegf cbfad eb fabcedg efabc ceb gfbe degafc gfeac abgced", "agbcde ceb gfbe beacf",
            "fgdc gbf fgcbda cefbga facdb gadbe gf bafdec gbdfa aebgfcd", "fbg gdcbaf efcbad fgaecbd",
            "ecadbf dcfbga bcdgeaf afgc adgcb bcf fbgde cf dgbaec cbfdg", "eafbcd cf abcdgf dfebg",
            "beafg edfgba fbacgd fcbeg ebcagd bdagf ea bae efad cgbfdea", "afebcgd cfgbad efcbg bgdeaf",
            "faegcb gefdb gdefcb dfcga dbfga fgadcbe ba bfeadg adeb abf", "bfagd fgbedc ebfdg gfcdbae",
            "adebc gacdeb gba aegbd cgefba ebfgdac acfdeb agdc ga bfdeg", "ecadb dbefg fbgcae gcdafeb",
            "gf dfbgec cdbef dgfb gcebdaf efbgc aefdcg bdaecf gef caebg", "cdafgbe gfe cgbfade fbcge",
            "cba ebfga ac agbdfec becgd cabdeg fdebgc daec gfbdac bagec", "ca ebgcd ecbdgf fgdbce",
            "gcafeb dbceg edga bcgdaef de bcfaed ced abecgd becga dcbgf", "agbcfe aedg ed aegbcf",
            "cbeg bcafg bgdaf ecgfba agc beafc ceagdbf cdegfa cg dfecab", "gebc debcagf cg gc",
            "dbaecgf gacbf gce bcedag bcgef dfceb ge efbdac degf dcfgbe", "ecg defg ecfgb bfecd",
            "ga gfceab bgdeafc acdbf bgcfe cbedga fgae bafcg fecbgd gba", "acgfb ebadcg fcbad bcagf",
            "cadb edbagf gdcbfa dgc cdfga adfbceg fagbd fgeca dcbegf cd", "gbfedc cdebfag debfcg fagbd",
            "fbcgea bacgedf gbce cdfagb eba be gbcfa egdabf cbafe acefd", "eacbfg abe cegfba ecgb",
            "bfcag gdba ba adfegbc eafbdc bfcdg ecagf bac fbgcad gcdfbe", "bgadcf ebgcfd acb gbfced",
            "ced geabcd dcaebgf fgaecb begac cadb cd cgdefa bdgec dfbeg", "beacdg bdaceg fgcaedb cbeagd",
            "gdacfb bfdgc gfaec ebfdcag fegbc cfgedb acdfeb gedb be cbe", "bgfec be gbed egcaf",
            "efcda abf gfdaeb gedcbfa abcdg bf bcdfa cfeb eagfdc caefbd", "gabdc fecdag bgdfeca bdegaf",
            "efcab gefcadb dcbge cagebd gfdb feacgd efd bdcefg df befdc", "fbdce acfeb cdebg fd",
            "gafbecd dacg efgbd dcfge ecdaf gcf cedfag febcga cg dbcefa", "fdaebc gc afgceb gecfba",
            "ebgcd fgba dbcgaf cgbad gac gdbceaf cfdba cgaedf afdceb ag", "abgdfec cegdb cag fbag",
            "ecbgf efac bgade bacedgf begca agbcef gbfedc agc fcabdg ac", "aefc fbcadg afbcgd dgcaefb",
            "fab cafgbe face acgbedf eagbc bdgafe egcabd fbgca gdbcf fa", "cfbgdea acbge cagbe fcea",
            "fedac ec gced bacgfe acdbf begadf gedbfac cae fdaeg cgdaef", "dfcgea dafge aefgdb fadge",
            "gbcade fe afbgc cedfga bdfe gbfae fae fdbega dgbae cdbagef", "egabf aef abgef efbd",
            "fagebc fad dcfab acdbfge ceabf egadbf edfc dbafec fd gdbca", "bafec dbgafe fd eafcb",
            "afg ecdbag fcage dbgefa abefc gfdc fgcbdae fg fdecga gdeca", "deacg fagdce cefag edfgca",
            "badfc gcfdea db fedcgb abde bcd fdecgab deafc facedb fgabc", "fbcgde abgcf gabfc aedgcf",
            "bdaefc daecb gfcad aebg edgbac gbfcde bg cbadfeg gcb dbcga", "bega cfabed cedba bgae",
            "afdbec ge aeg cdagb egfb cebadfg egbda agfdeb facdge efbad", "fdbeac agbdc ega cagdb",
            "cfe eagfd bacfg egdfba edac gefca gecdafb eacdgf egcdfb ce", "cfgbde fbgca efdbga daec",
            "abfcg bdcegaf ecbfg bafecd gcda dfcab cagfbd edgabf ga gab", "dacg gacd gacd bfgca",
            "egbac ec cbdgfa ceb agdcb bagedc cdbaefg gbaef fcbade decg", "dfacbg bafge ce efbag",
            "bd bdafce gcdfe fdcbg bfgca dfbceg dbf gecfda dgbcfea gdbe", "edfcg fcdge fbcgde gcedf",
            "eafcbdg eagbc gcaebd cfegab dfeca bgfedc cfb befac bfga bf", "bgdace bacfe fb feagbc",
            "bgedfc bgafedc adc bafec gcdeba egbcd dbeca gcafbd gead da", "gdefcb gecdab cbfged gcbde",
            "bgec eb fbgea aeb ecagf dabgf cdfage bfdcae cebgdfa fabceg", "cgadef begacf afgbe egcfdab",
            "fe fdecabg ebcfa bgcaf ebcgfa aebdc begf fcedga fdcbag aef", "bacde fae fegb efa",
            "gdefbac dgfecb afdg gcfbad gcd ecabg gd afcdb bfdcea gdcab", "acdgb dg dcg dafg",
            "bcaefd aceb dagecf ea cgebafd eda ebgdf faedb dbafc bgdcaf", "facbdg aecb aebc gdefb",
            "cafdeg egcfb ge afedcb egba acgfbe cebadfg gbfdc baefc egc", "ebga ge ecg aecfb"};

    String[] cleanInputKeys = new String[(rawInput.length) / 2];
    String[] cleanInputCodes = new String[(rawInput.length) / 2];

    public void getCleanInputCodes(String[] rawInput) {
        int newPos = 0;
        for (int i = 1; i < rawInput.length; i = (i + 2)) {
            cleanInputCodes[newPos] = rawInput[i];
            newPos++;
        }
    }

    public void getCleanInputKeys(String[] rawInput) {
        int newPos = 0;
        for (int i = 0; i < rawInput.length; i = (i + 2)) {
            cleanInputKeys[newPos] = rawInput[i];
            newPos++;
        }
    }

    public int[] findDistribution(String cleanInput) {
        String removeCommas = cleanInput.replace(" ", "");
        String[] individualLetters = removeCommas.split("");
        Arrays.sort(individualLetters);
        int[] distribution = new int[7];

        for (int k = 0; k < individualLetters.length; k++) {

            if (individualLetters[k].equals("a")) {
                distribution[0]++;
            }
            if (individualLetters[k].equals("b")) {
                distribution[1]++;
            }
            if (individualLetters[k].equals("c")) {
                distribution[2]++;
            }
            if (individualLetters[k].equals("d")) {
                distribution[3]++;
            }
            if (individualLetters[k].equals("e")) {
                distribution[4]++;
            }
            if (individualLetters[k].equals("f")) {
                distribution[5]++;
            }
            if (individualLetters[k].equals("g")) {
                distribution[6]++;
            }

        }
        return distribution;
    }

    public String findEncodedFour(String inputKeys) {
        String[] split = inputKeys.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (split[i].length() == 4) {
                return split[i];
            }
        }
        return null;
    }

    public void findEasySegments(int[] distribution, HashMap<Character, Character> sleutel) {
        for (int j = 0; j < distribution.length; j++) {
            if (distribution[j] == 6) {
                sleutel.put((char) (j + 97), 'B');
            }
            if (distribution[j] == 4) {
                sleutel.put((char) (j + 97), 'E');
            }
            if (distribution[j] == 9) {
                sleutel.put((char) (j + 97), 'F');

            }
        }
    }

    public void findHardSegments(int[] distribution, HashMap<Character, Character> sleutel, String encodedFour) {
        for (int k = 0; k < distribution.length; k++) {
            if (distribution[k] == 7) {
                if (encodedFour.indexOf((char) (k + 97)) >= 0) {
                    sleutel.put((char) (k + 97), 'D');
                } else {
                    sleutel.put((char) (k + 97), 'G');
                }
            }
            if (distribution[k] == 8) {
                if (encodedFour.indexOf((char) (k + 97)) >= 0) {
                    sleutel.put((char) (k + 97), 'C');
                } else {
                    sleutel.put((char) (k + 97), 'A');
                }

            }
        }
    }

    public String decodeSegments(String codes, HashMap<Character, Character> sleutel) {
        char[] encodedDigits = codes.toCharArray();
        for (int m = 0; m < encodedDigits.length; m++) {
            encodedDigits[m] = sleutel.get(encodedDigits[m]);
        }
        Arrays.sort(encodedDigits);
        return new String(encodedDigits);

    }

    public int decodeDigit(String codes, HashMap<Character, Character> sleutel) {
        String digit = decodeSegments(codes, sleutel);
        if (digit.equals("ABCEFG")) {
            return 0;
        }
        if (digit.equals("CF")) {
            return 1;
        }
        if (digit.equals("ACDEG")) {
            return 2;
        }
        if (digit.equals("ACDFG")) {
            return 3;
        }
        if (digit.equals("BCDF")) {
            return 4;
        }
        if (digit.equals("ABDFG")) {
            return 5;
        }
        if (digit.equals("ABDEFG")) {
            return 6;
        }
        if (digit.equals("ACF")) {
            return 7;
        }
        if (digit.equals("ABCDEFG")) {
            return 8;
        }
        if (digit.equals("ABCDFG")) {
            return 9;
        }
        System.out.println("AAAAAAAAAAAA" + digit);
        return 0;
    }

    public int decode(String cleanCodes, HashMap<Character, Character> sleutel) {
        int code = 0;
        String[] split = cleanCodes.split(" ");
        for (int m = 0; m < split.length; m++) {
            int getal = decodeDigit(split[m], sleutel);
            code = code * 10 + getal;

        }
        return code;

    }
}

/*
public void alphabetize(String[] cleanInput) {
        for (int k = 0; k < cleanInput.length; k++) {
            String[] inputSplit = cleanInput[k].split(" ");
            inputSplit.toString();
            for (int m = 0; m < inputSplit.length; m++) {
                String[] letterSplit = inputSplit[m].split("");
                Arrays.sort(letterSplit);
                letterSplit.toString();
            }
        }

 */

//
//
//
//C = find_segment_by_frequency_in("xxxx", 8) # find in "4"
//D = find_segment_by_frequency_in("xxxx", 7) # find in "4"
//A = find_segment_by_frequency_not_in(C, 8)
//G = find_segment_by_frequency_not_in(D, 8)

// HashMap<String,String> findEasy= new HashMap<String, String>();
// HashMap<int[],String> findEasy= new HashMap<int[], String>();

//HashMap<Integer[], String> findEasy= new HashMap<Integer[], String>(distribution[0]);
//        findEasy.put(6, "B");
//        findEasy.put(4, "E");
//        findEasy.put(9, "F");


//for (int x=0; x< distribution.length; x++){
//    if(distribution[x][1]==6){
//        B=[x][0];

//# 8a, 6b, 8c, 7d, 4e, 9f, 7g
//0= ABCEFG
//1=CF
//2=ACDEG
//3=ACDFG
//4=BCDF
//5=ABDFG
//6=ABDEFG
//7=ACF
//8=ABCDEFG
//9=ABCDFG
// return distribution;

/*
#7       3 segments
#8       7 segments
#1       2 segments
#4       4 segments
#3       5 segments, 2 in common with 1
#2       5 segments, 3 in common with 4
#5       5 segments, 2 in common with 4
#9       6 segments, 4 in common with 4
#6       6 segments, 1 in common with 1
#0       6 segments, 3 in common with 4 and 2 in common with 1
 */

/*
for (int k = 0; k < cleanInputKeys.length; k++) {
            char tempcleanInputKeys[]= cleanInputKeys[k].toCharArray();
            Arrays.sort(tempcleanInputKeys);
            tempcleanInputKeys.toString();
            cleanInputKeys[k]=tempcleanInputKeys;
        }
 */

/*
 //for (int n = 0; n < sevenSegment.cleanInputCodes.length; n++) {
        //    if (distribution[n].equals("ABCEFG")) {
        //        sleutel.put("0");
        //    }
        //}
 */