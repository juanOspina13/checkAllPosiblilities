/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkallposiblilities;
import java.util.HashMap;
import java.util.HashSet;

import java.util.LinkedList;
import java.lang.String;
/**
 *
 * @author Juan Manuel Ospina
 */
public class CheckAllPosiblilities {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> organismos  = new LinkedList();
        
        //1 a 10
        organismos.add("Zea mays");
        organismos.add("Yersinia pseudotuberculosis");
        organismos.add("Yersinia pestis ");
        organismos.add("Yersinia enterocolitica");
        organismos.add("Xenopus tropicalis");
        organismos.add("Xenopus laevis");
        organismos.add("Xanthomonas campestris");
        organismos.add("Vibrio cholerae");
        organismos.add("Thermotoga maritima");
        organismos.add("Thermosynechococcus elongatus");
        System.out.println(organismos.size());
        
        //11 a 20
        organismos.add("Sus scrofa");
        organismos.add("Sulfolobus solfataricus");
        organismos.add("Streptococcus pneumoniae");
        organismos.add("Staphylococcus haemolyticus");
        organismos.add("Staphylococcus aureus");
        organismos.add("Shewanella oneidensis");
        organismos.add("Shewanella frigidimarina");
        organismos.add("Salmonella typhimurium");
        organismos.add("Saccharomyces cerevisiae");
        organismos.add("Rhodopseudomonas palustris");
        
        
        //21 a 30
        organismos.add("Rhizobium meliloti");
        organismos.add("Rattus norvegicus");
        organismos.add("Pyrococcus horikoshii ");
        organismos.add("Pyrococcus furiosus");
        organismos.add("Pyrococcus abyssi");
        organismos.add("Pseudomonas syringae");
        organismos.add("Pseudomonas putida");
        organismos.add("Pseudomonas fluorescens");
        organismos.add("Pseudomonas aeruginosa");
        organismos.add("Pongo abelii");
        organismos.add("Proteus mirabilis");
        organismos.add("Shigella flexneri");
        
        
        
        //31 a 40
        organismos.add("Photorhabdus luminescens");
        organismos.add("Photobacterium profundum ");
        organismos.add("Pan troglodytes");
        organismos.add("Ovis aries");
        organismos.add("Oryza sativa");
        organismos.add("Oryctolagus cuniculus");
        organismos.add("Oceanobacillus iheyensis");
        organismos.add("Nicotiana tabacum ");
        organismos.add("Mycoplasma pneumoniae");
        organismos.add("Mycobacterium tuberculosis");
        
        //41 a 50
        organismos.add("Mycobacterium leprae");
        organismos.add("Mus musculus");
        organismos.add("Methylococcus capsulatus");
        organismos.add("Methanothermobacter thermautotrophicus");
        organismos.add("Methanosarcina mazei");
        organismos.add("Methanosarcina acetivorans ");
        organismos.add("Methanocaldococcus jannaschii");
        organismos.add("Macaca fascicularis");
        organismos.add("Lactococcus lactis");
        organismos.add("Lactobacillus plantarum");
        
        //51 a 60
        organismos.add("Klebsiella pneumoniae");        
        organismos.add("Homo sapiens");        
        organismos.add("Helicobacter pylori");        
        organismos.add("Halobacterium salinarum");        
        organismos.add("Gallus gallus");        
        organismos.add("Escherichia fergusonii");
        organismos.add("Escherichia coli"); //triplicada (-3)
        organismos.add("Drosophila melanogaster");        
        organismos.add("Deinococcus radiodurans ");
        organismos.add("Dechloromonas aromatica");        
        
        //61 a 70
        organismos.add("Debaryomyces hansenii");               
        organismos.add("Danio rerio");                
        organismos.add("Cupriavidus necator");
        organismos.add("Corynebacterium glutamicum");                
        organismos.add("Clostridium perfringens");        
        organismos.add("Clostridium acetobutylicum");   
        organismos.add("Chromobacterium violaceum");   
        organismos.add("Citrobacter koseri");        
        organismos.add("Caulobacter crescentus");
        organismos.add("Canis familiaris");
        
        
        //71 a 80
        organismos.add("Candida albicans");
        organismos.add("Campylobacter jejuni");         
        organismos.add("Caenorhabditis elegans");
        organismos.add("Caenorhabditis briggsae");
        organismos.add("Burkholderia pseudomallei");        
        organismos.add("Burkholderia mallei");         
        organismos.add("Burkholderia lata");        
        organismos.add("Buchnera aphidicola");
        organismos.add("Brucella melitensis");
        organismos.add("Brucella abortus");
        
        //81 a 90
        //organismos.add("Bradyrhizobium diazoefficiens ");  -4
        organismos.add("Bos taurus");
        organismos.add("Bordetella pertussis");         
        organismos.add("Bordetella bronchiseptica");
        organismos.add("Bacillus thuringiensis");
        organismos.add("Bacillus subtilis");        
        organismos.add("Bacillus halodurans");         
        organismos.add("Bacillus cereus");        
        organismos.add("Bacillus anthracis");
        organismos.add("Archaeoglobus fulgidus");
        organismos.add("Arabidopsis thaliana");
        
        //91 
        organismos.add("Aquifex aeolicus");
        organismos.add("Anabaena variabilis");         
        organismos.add("Agrobacterium tumefaciens");
        organismos.add("Aeromonas hydrophila");
        organismos.add("Acinetobacter baylyi");    
        int acum = 1 ;
        System.out.println(organismos.size());
        LinkedList <tupla> tuplas = new LinkedList();
        LinkedList <tupla> respuestas = new LinkedList();
        
        for(int i = 0 ; i < organismos.size(); i++)
        {
            for(int j = 0 ; j < organismos.size(); j++)
            {
                
                tupla tupla_organismos = new tupla(
                    organismos.get(i),
                    organismos.get(j)
                
                );
                tuplas.add(tupla_organismos);
            }
        }
        
        HashMap tuplas_que_salieron = new HashMap();
        String organism_name = "";

        for (int i = 0 ; i< tuplas.size(); i++)
        {
            tuplas_que_salieron.put(
                tuplas.get(i).getOrganismo1()+
                "_"+
                tuplas.get(i).getOrganismo2()    ,
                1    
            );
            
            if(tuplas.get(i).getOrganismo2() != tuplas.get(i).getOrganismo1() )   // si no devuelve nada no está
            {
                try
                {
                    if(
                        tuplas_que_salieron.get(tuplas.get(i).getOrganismo2()+"_"+tuplas.get(i).getOrganismo1()) == null 
                    ){
                        respuestas.add(tuplas.get(i));
                    }else{
                        
                    };
                }catch(Exception e1){
                }
            }
        
        }
        
        LinkedList<tupla> tuplas_que_no_estan = new LinkedList();
        for (int i = 0 ; i<respuestas.size(); i++)
        {
            /*
            TODO::
            String get_organisms_query = "SELECT * "+ 
                "FROM evolutionary_distance "+
                "WHERE organism_1 like '"+
                respuestas.get(i).getOrganismo1()+
                "' AND organism_2 like '"+
                respuestas.get(i).getOrganismo2()+
            "' ";
            si no existe en la base de datos agregue a otra lista
            tuplas_que_no_estan.add(respuestas.get(i));
            */
        }
        
        
                
    }
    
}
