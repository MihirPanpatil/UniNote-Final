import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Controller  {

    private Stage stage;
    private Scene scene;



    //Action Events for Links


    //Sem1

    //Maths-1
    public void ComplexNo(ActionEvent event) throws URISyntaxException, IOException, InterruptedException {
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1PKuS0UpQ7c7dNjdjwVCZ7ttRGwuCSeZQ/view?usp=sharing"));
    }
    public void Hyperbolic(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1wBPlqfBpASozqVnNg8NLnT2G1freAgc8/view?usp=sharing"));
    }
    public void PartialDiff(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1FB-eUw4mxDzvYyPzSqN_Pb4sanllu0rE/view?usp=sharing"));
    }
    public void SuccessiveDiff(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1oXEx8C2aqfYUtN8hOOg7KVy46uo1GyoK/view?usp=sharing"));
    }
    public void Matrices(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1m-vUh96WiQXNX8OGICtnAff_vha8skDD/view?usp=sharing"));
    }
    /*public void SysOLE(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI(""));
    }*/

    //Physics-1
    public void QuantumMech(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1_69IUWeSWS7j5az9-1nRiTmcJlXcnMhY/view?usp=sharing"));
    }
    public void Crystallo(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1Vjal4Mv2M1O2nMlc1iEAlr9a0g9V5t-Z/view?usp=sharing"));
    }
    public void SemiConductor(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1qGYs5DQKzx9ILKyiK14KvqIwQVtnXBP1/view?usp=sharing"));
    }
    public void Interference(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/18J8nFoHuNfiVvkJrfj1SAcBhkEFkYdZ2/view?usp=sharing"));
    }
    public void SuperSuper(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1CtgfoynL7CU_tsTc0CvDw9i8MEQu-63W/view?usp=sharing"));
    }
    public void EngMat(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1UC3Ygl9wAKG6L0tg61qHrlkrN6TVKsOG/view?usp=sharing"));
    }

    //Chem-1
    public void AtomicNMole(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1MVbaJByELs_nFNmmlQAZFXe8oQMeSDuP/view?usp=sharing"));
    }
    public void Aromatic(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1LpxUiIG3gTUA0C5s4GvHbvBnXW2NnpNV/view?usp=sharing"));
    }
    public void InterForces(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1_Rl3WaBA9Pws1Ip0q4Axanj1aoDA_VHX/view?usp=sharing"));
    }
    public void PhaseRule(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1UoYSaikWyD0HdS5246_ENfu8xsIjCxre/view?usp=sharing"));
    }
    public void Polymer(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1Kx4dyGwCutePcsxJcjymdFhIbB7ENk3o/view?usp=sharing"));
    }
    public void Water(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/19HZPeTQerAFScJhSRHSPBtodksyUtoWE/view?usp=sharing"));
    }

    //Mechanics
    public void SystemOfCo(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1nqUeP8oaavEB68QD6SvHDjMeP3a9_IPl/view?usp=sharing"));
    }
    public void Equillibrium(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1K2MwGFb_kL2DCjtEpsmHj1SgoxP1KeG5/view?usp=sharing"));
    }
    public void Friction(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1LeDkeCNCMtIb9HRAv1EdRw4VvJ8eR8tr/view?usp=sharing"));
    }
    public void KineOfPart(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1adnT8mlzOQo1gGPKkCMEdX0a_Lu466dk/view?usp=sharing"));
    }
    public void KineOfRigid(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/11nekIkxaoGhOv7MvGG3jjETaQHSJengB/view?usp=sharing"));
    }
    /*public void Kinetics(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI(""));
    }*/

    //BEE
    public void DCCircuit(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1gaLmPOLBb5-k5AyCf1rrFcn5fjMkSDPy/view?usp=sharing"));
    }
    public void ACCircuit(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1XMHNyGrzGy5DTa-9naUPD47qhcw1u2Oa/view?usp=sharing"));
    }
    public void ThreePhase(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/17Erx4fZra4KTlCCRNmNKMbumVpypyBkH/view?usp=sharing"));
    }
    /*public void Transformers(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI(""));
    }*/
    public void ElecMachines(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://docs.google.com/presentation/d/1j9khv3yZhZCHz2F6IpYaZOUVIupr0Ccc/edit?usp=sharing&ouid=101591448876651283016&rtpof=true&sd=true"));
    }
    public void Motors(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://docs.google.com/presentation/d/1uMMrq4_nRaw_FeJfu_mxYr7BMby25N02/edit?usp=sharing&ouid=101591448876651283016&rtpof=true&sd=true"));
    }




    //Sem-2

    //Maths-2
    public void DiffEqn(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/drive/folders/1n2MFouXk8_8S9qh5bNMQrsL4vdpDSBbb?usp=share_link"));
    }
    public void ConstCoeff(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/drive/folders/1TeWogiU_LODrakuMBbkARpTedkaQBBYN?usp=share_link"));
    }
    public void BetaGamma(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/14ImzIQUa6L_S2GX-3qyoK0jAnNLzQQBZ/view?usp=share_link"));
    }
    public void DoubleInt(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/181wXlSRiQBYYHXvGW50hf4-Pb9xdMQPL/view?usp=share_link"));
    }
    public void TripleInt(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1_t9x3sOT4lh4L394Y-6OwsfJRtrr35A4/view?usp=share_link"));
    }
    /*public void NumInt(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI(""));
    }*/

    //Physics-2
    public void Diffraction(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1Aq5QQLJc_O0h4djIl2yk2POYaFyRB3Zc/view?usp=sharing"));
    }
    public void LaserNOptic(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/drive/folders/17QN6sS6egUyifmKllc7fdGYeyO0zjAnX?usp=sharing"));
    }
    public void ElectroDyna(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/18-Am_JIzcO6ha5Kwj6cZFAQnGbU5pSYf/view?usp=sharing"));
    }
    public void Relativity(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/drive/folders/1Fp_ebL68BCWHZJLYHN7qNA5eC1gcwyit?usp=share_link"));
    }
    public void NanoTech(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/drive/folders/1G_vT2EAnkotosLTZgQN3eLl71hoLROiF?usp=share_link"));
    }
    public void Sensors(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/drive/folders/11iJQg__4oemJwwpDvH_axw8OEECnyk7v?usp=share_link"));
    }

    //Chem-2
    public void PrinSprectro(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1vXALgjQItO0nCyelcEh-sAsWDiBoskUX/view?usp=sharing"));
    }
    /*public void AppSpectro(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/drive/folders/11iJQg__4oemJwwpDvH_axw8OEECnyk7v?usp=share_link"));
    }*/
    public void Electochem(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1povJ9pqy_8yT7ay2RzIZ5blaWfBj00Em/view?usp=sharing"));
    }
    public void Corrosion(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1iC9I24Rk4nmUtOF9G86xbXIYOYsonKiX/view?usp=sharing"));
    }
    public void GreenChem(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1k_BlSJf81FgzxoELPMWucWdDNsghqP8T/view?usp=sharing"));
    }
    public void FuelnComb(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1u65gtMqiQHCuqprsdYGud2jEyDejZVsB/view?usp=sharing"));
    }



    //CP
    public void FundOfC(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1Ihjx7dA3RbTQfdAvdzvGtJBvMPqFqc2X/view?usp=sharing"));
    }
    public void ControlStruct(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1HQHkONrzSuTdbMDRyJtskzjRybjOfsAJ/view?usp=sharing"));
    }
    public void Functions(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1sZQJWIAE4lwhLwhaCngR2OZ8f9Y89xdL/view?usp=sharing"));
    }
    public void ArrAndStr(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1lG3KtA5ucZEGxNii4CsWCaGwmSczMOUM/view?usp=sharing"));
    }
    public void StructAndUnion(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1qsZ_heWiXTT8Nmd0nivv4kv5ZsWzZxM3/view?usp=sharing"));
    }
    public void Pointers(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1Eep5OOk8IwmD66Zmb4TqNZaAO8STXxLw/view?usp=sharing"));
    }

    //PCE-1
    public void FundOCommu(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1ZlOc5M6xgDyIf_2RCrX7120w0Y4Be3Aq/view?usp=sharing"));
    }
    public void VerbalApti(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/16m8kWEs-ise4wHDLAl7d6wy3_wcpYkyI/view?usp=sharing"));
    }
    public void DevReadWrite(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/14JqH13FpNG9OMWKfBkuAytt44lg4CTrz/view?usp=sharing"));
    }
    public void BusinessCorres(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1-0KEAAblCNm3HcOxEb_FoIoMgGjJVpZN/view?usp=sharing"));
    }
    public void BasicTechWrite(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1qeXXheeNq87Cxqa45bPxL5hVDJF6MzIR/view?usp=sharing"));
    }
    public void PersonalDev(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/18v20B8ec7BRu_-1kypD8YKoyJEOyBLUe/view?usp=sharing"));
    }




    //Sem-3

    //Maths-3
    public void Laplace(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/10Np350EHWdcCGZjjgQXsusgL7WcfvLgD/view?usp=drivesdk"));
    }
    public void InverseLaplace(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1FHqobfqVOViFNGcRBz4GCZ6E71Oyrs-x/view?usp=sharing"));
    }
    public void Fourier(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1cTFSUCuFkhS8aLJi3yHAbO7CzjnoxgRF/view?usp=share_link"));
    }
    public void ComplexVar(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/10efYyHf-n3ehHnvARHWnz-HZXso73m_s/view?usp=share_link"));
    }
    public void Statistics(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1I2qBg8D9fIp6jGj0GJSuln71b1NXiV8L/view?usp=sharing"));
    }
    public void Probability(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/14BNuTVL_fOfWcmEBGWxNLmb7kgedt0cJ/view?usp=sharing"));
    }

    //DSGT
    public void Logic(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1RcNL2SMDRbHYX48LxV-oqq-SNUEIuio6/view?usp=sharing"));
    }
    public void RnF(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1sKFfWC3LLmdCjmrKHxf-rhAIQEt3hkBV/view?usp=sharing"));
    }
    public void PosetnLat(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/11rwK5LSt3yBypRAXQa2xkBcygnTx7Faf/view?usp=sharing"));
    }
    public void Counting(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1mKus82VZOdTSnlve1dNRyD3F1reQAuy0/view?usp=share_link"));
    }
    public void AlgebraicStruct(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1_sfwqHPwQ1PGb1vdV2VS8-q2pyf12mdP/view?usp=sharing"));
    }
    public void GraphT(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1MmyiCUt2YNWheOnlu9vSYLkQRN1BVEMX/view?usp=sharing"));
    }

    //DS
    public void IntroToDS(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1EH3kmKxAe38QX6YKTq7vhFXMBRgJxsCW/view?usp=sharing"));
    }
    public void SnQ(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1WbcUQ-juqkycPgHOMj5sdBdMKHGcjl9D/view?usp=sharing"));
    }
    public void LinkedList(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1QtGybVZRsBBvoFBB0xfoVLRmJuBpAyWt/view?usp=sharing"));
    }
    public void Trees(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1yjlYsSUynLVul9EaxaBzUVqECl3ghM0b/view?usp=sharing"));
    }
    public void Graphs(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1RkJhz1cXv7NxLq2tFKkL9T3q-yv4emLZ/view?usp=sharing"));
    }
    public void SearchingTech(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1azXSZmIPeMyS4Yovl_6tIcthqKw2lcEw/view?usp=sharing"));
    }

    //DLCOA
    public void ComputerFund(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1Ofme_kApLm244--W7-LGOwoKHrkgD5Ek/view?usp=sharing"));
    }
    public void DRAA(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1lDmcMAtak_QkArzpCOjTPPsep2kiiNX6/view?usp=sharing"));
    }
    public void POA(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1Pl2VgjreLU0zf6Mjk4gQbHdM2PwCRmK4/view?usp=sharing"));
    }
    public void ControlUD(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1aYgDhk1mTp_IlCmaQJ9yP8fv2mDx9eIb/view?usp=sharing"));
    }
    public void MemOrg(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1XrbK0Zm-VOjW3j1UjSj4eefUewiQv_1f/view?usp=sharing"));
    }
    public void PAPB(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1XsQYKvYTaKkanjnXeOGSiIK2kKINdRl8/view?usp=sharing"));
    }

    //CG
    public void IOGS(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1CyOtDC9Y-7KcKe4NMqWRo9XO0s-qdd3i/view?usp=sharing"));
    }
    public void OutputPrim(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1pqgjus6ioenzRIVmWOrOuzgqhKTUsG-_/view?usp=sharing"));
    }
    public void TwoDGT(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1ywYn5M9F1BysMmgd1gkptv9xAjAOjSNC/view?usp=sharing"));
    }
    public void TwoDVC(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/12H6erfU8SNH02-7NJXbEbB3nZvjMOJMv/view?usp=sharing"));
    }
    public void ThreeDGT(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/10Az2dgzhrcqqdnqgNeQskq8-RQhw21We/view?usp=sharing"));
    }
    public void VSDA(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1XkPlO9KriyyfxjxbEVq4xF_3rBL3MfnF/view?usp=sharing"));
    }

    //Java Not Added

    //Sem-4
    //Maths-4
    public void LinearAlge(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1LVUPfCfamy78qJueyfcgTpTbe3sHcqB7/view?usp=drive_link"));
    }
    public void ComplexInt(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1g2tnEx1ymcSxawZGayX1E1GiWytRED8g/view?usp=sharing"));
    }
    public void ZTransform(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1rT3jCF033bpUZ6EylAd8JHcrSYfvtZYr/view?usp=sharing"));
    }
    public void ProbDistribution(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1oIadVlKa4Kdwyg3EW-V36RwrmWxr_roJ/view?usp=sharing"));
    }
    public void LinearProgramming(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1rT3jCF033bpUZ6EylAd8JHcrSYfvtZYr/view?usp=sharing"));
    }
    public void NonLinearProgramming(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1-AW9Z8R8PYXKFMIb0xyC4lf7Pa-feT4L/view?usp=sharing"));
    }

    //Analysis of Algo.
    public void IntroAOA(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1iQgaPUv8ZoKUGD-SKr8wVz8WtflP5IV_/view?usp=sharing"));
    }
    public void DivNConq(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1jnApftfv8WpFLB0K5qHxEjSR7QefReiT/view?usp=sharing"));
    }
    public void GreedyMet(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1n-GB-lf5Iqy5BJO35qNgRTseHmKCXG6I/view?usp=sharing"));
    }
    public void DynamicProg(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1VYZF7mHsRc1Zk4FGdLiNzPkHYcu9otol/view?usp=sharing"));
    }
    public void BackTracking(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1kiih2qQYbVtXMwDhvqkqYToBO-cu6JQm/view?usp=sharing"));
    }
    public void StringMatchAlgo(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1JtCnC1m1Or9sxZWG59MQSLwIVVIRGg8F/view?usp=sharing"));
    }

    //DBMS
    public void IntroDB(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1qGy3dJz7CG0nKLtVrMzwVzDladGCURzu/view?usp=sharing"));
    }
    public void EntityRelation(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1c_V0biZL7nm4CDt3m1GpW9QnryW5ZFUp/view?usp=sharing"));
    }
    public void RelationModel(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1LW6NrbbHZ3MEK-weWw-DEthWzA8sAGp5/view?usp=sharing"));
    }
    public void SQL(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/18sbfPmY5nzamrumlI8BQ9YdSHmr46LHp/view?usp=sharing"));
    }
    public void RelationalDB(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1TRp0XYXDo720-cJG2NXHGgo6hdyrexT5/view?usp=sharing"));
    }
    public void TransactionManagement(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1ZK4lzXbhr9uZwWOzT5iKvmfHPyTTf6Ae/view?usp=sharing"));
    }

    //OS
    public void OSOverview(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1xjBWcAAnlsyomtbKc_z5XmdbsvRYUJKl/view?usp=sharing"));
    }
    public void ProcessAndScheduling(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1bW7dzSESBDcN6slkCBfkSW5-XRiv6LWy/view?usp=sharing"));
    }
    public void ProcessSync(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1Vpum9c4ggPj9a2pL4Ku9cA9MIipeyHFB/view?usp=sharing"));
    }
    public void MemoryManage(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1e1DoiaVWt0CDaoAQNmn7NRzZK9CKAh9m/view?usp=sharing"));
    }
    public void FileManage(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1WNEmF0pMNJibm86USdWk1ouzQ3gMxxSc/view?usp=sharing"));
    }
    public void IOManage(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1VqT34P0noZLtvDDbOPoz7oa_105h3Ug_/view?usp=sharing"));
    }

    //Microprocessor
    public void Intel8086(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1uM2ZZDY9h2j096GNpA-fTU0GG2_CYnpV/view?usp=sharing"));
    }
    public void InstructionSet(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1oLjWSJC30O2uTRW90IuJiYx0jcSS7m7_/view?usp=sharing"));
    }
    public void MemoryAndPeripheral(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1WHdSUZOmeoYktxJeCFVBEQdhbhCE2Bq4/view?usp=sharing"));
    }
    public void Intel80386DX(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1bTiN2vLAn7ZERLc1xmXYSXd2-Y5Odrsv/view?usp=sharing"));
    }
    public void Pentium(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1fSId4QmSn4ylwb2cuL_Gk5EY18A-w6aL/view?usp=sharing"));
    }
    public void Pentium4(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();
        d.browse(new URI("https://drive.google.com/file/d/1B13ouqylMxMXlwW6aFk3B0KRWAthKJx8/view?usp=sharing"));
    }







    //Addresses
    public void switchToHome(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("UniNote.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSem1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sem1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSem2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sem2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSem3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sem3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSem4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sem4.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSem5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sem5.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSem6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sem6.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSem7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sem7.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSem8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sem8.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    //Sem-1
    public void Maths1(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Maths1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Physics1(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Physics1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Chem1(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Chem1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Mechanics(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Mechanics.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void BEE(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("BEE.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //Sem-2
    public void Maths2(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Maths2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Physics2(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Physics2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Chem2(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Chem2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void CP(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CP.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Graphics(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Graphics.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void PCE1(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("PCE1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Sem-3
    public void Maths3(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Maths3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void DSGT(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("DSGT.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void DS(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("DS.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void DLCOA(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("DLCOA.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void CG(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CG.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SkillLabJava(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SkillLabJava.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //Sem4
    public void Maths4(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Maths4.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void AOA(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AOA.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void DBMS(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("DBMS.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void OS(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("OS.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Microprocessor(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Microprocessor.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SkillLabPython(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SkillLabPython.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //Sem5
    public void CN(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CN.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void WC(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("WC.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void AI(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void DWM(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("DWM.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     public void BCE2(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("BCE2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Sem6
    public void DAV(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("DAV.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void CSS(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CSS.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SEPM(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SEPM.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void ML(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void CloudComp(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("CloudComp.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Sem7
    public void DL(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("DL.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void BDA(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("BDA.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //Sem8
    public void AAI(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("AAI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}
