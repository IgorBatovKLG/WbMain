package ru.batov.wbmain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.batov.wbmain.models.catalog.CatalogEntity;
import ru.batov.wbmain.models.catalog.SubjectIdEntity;
import ru.batov.wbmain.repositories.CatalogRepositories;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class updateCatalog {

    final
    CatalogRepositories catalogRepositories;

    public updateCatalog(CatalogRepositories catalogRepositories) {
        this.catalogRepositories = catalogRepositories;
    }

    @Transactional
    public void updateCatalog() {
        List<SubjectIdEntity> subList = new ArrayList<>();
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(257).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(453).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(466).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(468).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(479).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(518).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(519).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(520).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(526).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(542).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(544).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(545).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(547).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(548).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(549).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(593).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(765).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(785).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(790).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(792).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(794).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(916).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1001).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1135).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1142).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1239).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1240).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1241).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1242).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1260).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1313).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1383).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1407).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1413).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1495).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1558).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1571).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1650).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1950).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(1977).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2009).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2026).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2103).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2104).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2138).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2185).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2187).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2286).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2300).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2436).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2483).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2548).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2767).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2796).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2809).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2819).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2823).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2864).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2913).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2923).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(2974).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3001).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3049).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3116).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3152).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3153).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3154).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3155).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3156).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3158).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3553).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3576).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3623).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3641).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3947).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(3971).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4016).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4018).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4033).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4042).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4115).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4117).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4124).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4183).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4496).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4539).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4540).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4541).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4543).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4544).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4545).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4547).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4548).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4555).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4680).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4864).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(4875).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(5720).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(5936).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(5943).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(5974).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6023).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6065).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6106).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6237).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6238).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6257).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6258).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6259).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6260).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6261).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6270).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6271).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6272).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6455).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6499).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6817).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(6931).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(7260).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(7283).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(7422).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(7440).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(7457).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(1).subject(7580).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(239).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(515).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(516).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(517).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(533).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(760).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(777).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(787).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(844).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(911).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(924).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(1258).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(1309).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(1375).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(1422).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(1470).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(1514).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(1529).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(1605).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(2320).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(2376).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(2559).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(2561).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(2800).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(2833).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(3061).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(3095).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(4580).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(4874).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(5486).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(5487).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(5488).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(5489).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(5547).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(5594).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(5801).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(6311).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(6492).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(6530).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(2).subject(6560).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(3).subject(604).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(3).subject(1352).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(3).subject(2761).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(195).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(330).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(523).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(524).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(525).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(527).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(532).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(557).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(657).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(982).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(1027).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(1151).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(1388).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(1598).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(1673).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(3656).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(3699).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(3711).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(4030).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(4072).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(4743).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(5474).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(5923).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(4).subject(6256).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(599).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(600).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(601).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(742).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(764).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(773).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(788).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(789).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(793).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(846).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(910).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(928).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(973).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1003).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1004).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1066).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1152).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1174).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1265).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1295).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1305).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1353).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1357).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1378).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1498).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1505).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1530).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1531).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1532).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1533).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1534).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1538).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1649).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1681).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1820).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1889).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1906).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1907).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(1976).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2037).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2105).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2145).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2186).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2194).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2196).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2205).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2207).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2290).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2355).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2374).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2468).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2471).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2479).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2534).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2537).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2560).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2562).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2630).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2667).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2709).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2744).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2795).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2797).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2816).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2875).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2888).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2889).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2890).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2891).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2892).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2972).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(2994).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3062).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3081).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3089).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3112).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3113).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3121).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3122).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3125).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3128).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3162).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3203).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3205).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3211).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3274).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3357).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3577).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3690).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3698).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3716).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3777).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3808).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3850).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3856).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3858).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3866).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3869).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3875).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3894).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3975).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3989).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3990).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(3993).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4014).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4031).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4066).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4075).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4102).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4234).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4243).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4244).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4270).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4282).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4398).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4495).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4504).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4527).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4528).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4529).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4566).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4567).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4818).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4821).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4865).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4953).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(4989).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5002).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5003).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5024).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5081).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5172).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5174).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5175).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5182).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5183).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5221).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5230).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5274).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5319).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5320).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5349).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5376).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5472).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5521).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5541).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5627).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5669).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5748).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5794).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5797).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5806).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5868).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5869).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5898).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5899).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5900).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5926).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(5942).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6016).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6017).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6202).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6226).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6240).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6309).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6310).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6327).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6444).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6456).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6462).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6463).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6542).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6545).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(6547).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(7622).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(6).subject(7760).build());
        subList.add(SubjectIdEntity.builder().id(0).catalogId(7).subject(390).build());


        CatalogEntity electronic1 = CatalogEntity
                .builder()
                .id(0)
                .subCatalogId(1)
                .name("electronic1")
                .build();
        CatalogEntity electronic2 = CatalogEntity
                .builder()
                .id(0)
                .subCatalogId(1)
                .name("electronic2")
                .build();
        CatalogEntity electronic3 = CatalogEntity
                .builder()
                .id(0)
                .subCatalogId(1)
                .name("electronic3")
                .build();
        CatalogEntity electronic4 = CatalogEntity
                .builder()
                .id(0)
                .subCatalogId(1)
                .name("electronic4")
                .build();

        CatalogEntity electronic5 = CatalogEntity
                .builder()
                .id(0)
                .subCatalogId(1)
                .name("electronic5")
                .build();

        CatalogEntity electronic6 = CatalogEntity
                .builder()
                .id(0)
                .subCatalogId(1)
                .name("electronic6")
                .build();

        CatalogEntity electronic7 = CatalogEntity
                .builder()
                .id(0)
                .subCatalogId(1)
                .name("electronic7")
                .build();

        catalogRepositories.saveCatalogEntity(electronic1);
        catalogRepositories.saveCatalogEntity(electronic2);
        catalogRepositories.saveCatalogEntity(electronic3);
        catalogRepositories.saveCatalogEntity(electronic4);
        catalogRepositories.saveCatalogEntity(electronic5);
        catalogRepositories.saveCatalogEntity(electronic6);
        catalogRepositories.saveCatalogEntity(electronic7);
        System.out.println("!!!!!!!!!!!!!!!!!!");
        subList.forEach(catalogRepositories::saveSubjectIdEntity);


    }
}
