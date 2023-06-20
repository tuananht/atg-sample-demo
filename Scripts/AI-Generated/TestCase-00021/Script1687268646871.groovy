import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_u'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/u')

'step 2: At Page_u click on div_object --> navigate to Page_home'

testObj = findTestObject('Object Repository/Page_u/div_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/u(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_home click on hyperlink_forum_katalon_com_t --> navigate to Page_t_help-my-test-keeps-passing-but-should-fail-strange-i-know'

testObj = findTestObject('Object Repository/Page_home/hyperlink_object_78')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_t_help-my-test-keeps-passing-but-should-fail-strange-i-know click on div_object'

testObj = findTestObject('Object Repository/Page_t_can-i-verify-excel-data-download-from-website/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/can-i-verify-excel-data-download-from-website/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page_t_help-my-test-keeps-passing-but-should-fail-strange-i-know'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00021_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
