
package edu.fcm.hcdl.controller;

import edu.fcm.hcdl.model.Provincia;
import edu.fcm.hcdl.service.ProvinciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author martin
 */
@Controller
@RequestMapping("/provincias")
@SessionAttributes("roles")
public class ProvinciaController {

    @Autowired
    AuthenticationTrustResolver authenticationTrustResolver;

    @Autowired
    ProvinciaService provinciaService;

    @RequestMapping(value = {"","/list"}, method = RequestMethod.GET)
        public String provinciasList(ModelMap model) {
        System.out.println("ENTRO PROVINCIA CONTROLLER");
        List<Provincia> pl = provinciaService.findAllProvincias();
        model.addAttribute("lst", pl);
        model.addAttribute("loggedinuser", getPrincipal());
        return "provinciaList";
    }

    @RequestMapping(value = "/newProvincia", method = RequestMethod.GET)
        public String provinciaNew(ModelMap model) {
        List<Provincia> pl = provinciaService.findAllProvincias();
        model.addAttribute("lst", pl);
        return "provinciaCreate";
    }
        
    @RequestMapping(value = "/newProvincia", method = RequestMethod.POST)
    public String provinciaSave(ModelMap model,Provincia provincia, BindingResult result) {
        return "hola";
    }
    
    @RequestMapping(value = "/addProvinciaForm", method = RequestMethod.GET)
    public String getAddUserForm(ModelMap model) {
        
        Provincia p = new Provincia();
        boolean update = false;
//        if (id != -1){
//            p = provinciaService.findById(id);
//            update = true;
//        }
        model.addAttribute("provincia", p);
        model.addAttribute("update", p);
        model.addAttribute("action","saveNewUser");
        return "addProvinciaForm";
    }
//    
//    /**
//     * This method returns the principal[user-name] of logged-in user.
//     */
    private String getPrincipal() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }

    /**
     * This method returns true if users is already authenticated [logged-in],
     * else false.
     */
    private boolean isCurrentAuthenticationAnonymous() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authenticationTrustResolver.isAnonymous(authentication);
    }
}
