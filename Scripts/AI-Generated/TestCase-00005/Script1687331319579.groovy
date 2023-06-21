import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_recap-how-to-do-mobile-test-automation-at-scale-with-katalon'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/recap-how-to-do-mobile-test-automation-at-scale-with-katalon/89202')

'step 2: At Page_t_recap-how-to-do-mobile-test-automation-at-scale-with-katalon click on hyperlink_forum_katalon_com_t_webinar_how_to_do_m --> navigate to Page_t_webinar-how-to-do-mobile-test-automation-at-scale-with-katalon'

testObj = findTestObject('Object Repository/Page_t_recap-how-to-do-mobile-test-automation-at-scale-with-katalon/hyperlink_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/recap-how-to-do-mobile-test-automation-at-scale-with-katalon/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_webinar-how-to-do-mobile-test-automation-at-scale-with-katalon'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00005_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
