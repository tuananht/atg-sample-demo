import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_community-contributor-program-help-us-grow-our-forum-get-rewarded'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/community-contributor-program-help-us-grow-our-forum-get-rewarded/88089')

'step 2: At Page_t_community-contributor-program-help-us-grow-our-forum-get-rewarded click on div_ember4 --> navigate to Page_t_help-my-test-keeps-passing-but-should-fail-strange-i-know'

testObj = findTestObject('Object Repository/Page_t_community-contributor-program-help-us-grow-our-forum-get-rewarded/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/community-contributor-program-help-us-grow-our-forum-get-rewarded/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_help-my-test-keeps-passing-but-should-fail-strange-i-know'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00006_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
