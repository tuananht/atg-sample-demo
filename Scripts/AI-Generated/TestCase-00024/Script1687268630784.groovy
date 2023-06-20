import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_faq'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/faq')

'step 2: At Page_faq click on hyperlink_ --> navigate to Page_home'

testObj = findTestObject('Object Repository/Page_faq/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/faq(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_home click on hyperlink_t_mobile_execution_ci_cd_on_a_gh_actions --> navigate to Page_t_testlink-integration-not-showing-in-plugin-section'

testObj = findTestObject('Object Repository/Page_home/hyperlink_object_101')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page_t_testlink-integration-not-showing-in-plugin-section'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00024_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
