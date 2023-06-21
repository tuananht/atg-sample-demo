import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_api-get-request-works-on-postman-but-not-on-katalon-with-same-authorization-and-access-token'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/api-get-request-works-on-postman-but-not-on-katalon-with-same-authorization-and-access-token/30707')

'step 2: At Page_t_api-get-request-works-on-postman-but-not-on-katalon-with-same-authorization-and-access-token click on hyperlink_europe1_discourse_58396fa433b7b0418c2d1'

testObj = findTestObject('Object Repository/Page_t_api-get-request-works-on-postman-but-not-on-katalon-with-same-authorization-and-access-token/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/api-get-request-works-on-postman-but-not-on-katalon-with-same-authorization-and-access-token/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_api-get-request-works-on-postman-but-not-on-katalon-with-same-authorization-and-access-token'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00004_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
