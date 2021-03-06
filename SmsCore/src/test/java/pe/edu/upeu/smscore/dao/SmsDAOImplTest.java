package pe.edu.upeu.smscore.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import junit.framework.Assert;
import pe.edu.upeu.smscore.AbstractUnitTest;
import pe.edu.upeu.smscore.domain.Campaign;
import pe.edu.upeu.smscore.domain.Departament;
import pe.edu.upeu.smscore.domain.Role;
import pe.edu.upeu.smscore.domain.Sms;
import pe.edu.upeu.smscore.domain.UserSystem;
import pe.edu.upeu.smscore.util.StatusAccessApp;
import pe.edu.upeu.smscore.util.StatusCampaign;

public class SmsDAOImplTest extends AbstractUnitTest {

	@Autowired
	protected SmsDAO smsDAO;

	public void testDepartament() {
		Departament departament = new Departament();
		departament.setAreaName("Admision");
		departament.setDescription("UPeU - Admision");
		smsDAO.saveDepartament(departament);
		setComplete();
		
		List<Departament> list = smsDAO.findDepartamentByStatus(null);
		
		Assert.assertNotNull(list);
		
		Departament d = list.get(list.size()-1);
		
		Assert.assertEquals(d.getAreaName(), "Admision");
		Assert.assertEquals(d.getDescription(), "UPeU - Admision");
		System.out.println("::::::::::::testDepartament::::::::::::");
		
	}

	public void testFindCampaignByDepartamentId(){
		
		List<Campaign> list= smsDAO.findCampaignByDepartamentId(3l);
		
		Assert.assertNotNull(list);
		Assert.assertEquals(2, list.size());
		System.out.println(":::::::::::testFindCampaignByDepartamentId::::::::::::::");
	}
	
//
//	public void testSaveSms() {
//		Sms sms = new Sms();
//		sms.setNameAll("David");
//		sms.setMessage("Favor de pagar su deuda 2512.25");
//		sms.setNumPhone("995590753");
//		
//		smsDAO.saveSms(sms);
//		setComplete();
//		
//		//smsDAO.findSmsAll(campaignId, departamentId, status, 0);
//		
//	}
//
//	public void test() {
//		
//		StatusCampaign statusUser = null;
//		statusUser = StatusCampaign.STATUS_CAMPAIGN_ACT;
//
////		System.out.println(statusUser.);
//		
//		System.out.println(StatusAccessApp.STATUS_ACCESS_ACT.toString());
//		System.out.println(StatusAccessApp.STATUS_ACCESS_ACT.getStatusCode());
//	}
//	
//	public void testCampaign() {
//		Campaign campaign = new Campaign();
//		campaign.setCampaingName("Aniversario del Universidad Peruana Unión FJ");
//		campaign.setStatusCampaign("Activo");
//
//		smsDAO.saveCampaign(campaign);
//		setComplete();
//	}
//
//
//
//	public void testFindAccessAppByIMEI() {
//	//	System.out.println(">> " + smsDAO.findAccessAppByIMEI("515151515").getDepartamentId());
//	}
//
//	public void testFindSmsAll() {
//		System.out.println(">>>>>" + smsDAO.findSmsAll(11L,3L, "Activo",0).size());
//	}
//
//	public void testFindSmsById() {
//		System.out.println(">>>>>" + smsDAO.findSmsById(1L));
//	}
//
//	public void testFindRoleByUserId() {
//		//System.out.println(">>>>>" + smsDAO.findUserSystemRoleByUserId(1L));
//	}
//	// findRoleByUserId
//
//
//	public void testFind() {
//		UserSystem userSystem = smsDAO.findUserSystemById(1L);
////		List<UserSystemRole> listUserSystemRole = userSystem.getUserSystemRoleLista();
///*
//		List<Role> list = smsDAO.findRoleByUserId(1L);
//		for (Role role : list) {
//			System.out.println();
////			listUserSystemRole.contains(role);
//
//		}
//*/
//	}

}
