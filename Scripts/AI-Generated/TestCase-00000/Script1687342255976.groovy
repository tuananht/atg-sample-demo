import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_can-we-get-testcase-name-from-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/can-we-get-testcase-name-from-code/10989/2')

'step 2: At Page_t_can-we-get-testcase-name-from-2 click on code_object'

testObj = findTestObject('Object Repository/Page_t_can-we-get-testcase-name-from-code/code_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/can-we-get-testcase-name-from-code/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_t_can-we-get-testcase-name-from-2 click on code_object'

testObj = findTestObject('Object Repository/Page_t_can-we-get-testcase-name-from-code/code_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/can-we-get-testcase-name-from-code/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_t_can-we-get-testcase-name-from-2 click on code_object --> navigate to Page_t_can-we-get-testcase-name-from-4'

testObj = findTestObject('Object Repository/Page_t_can-we-get-testcase-name-from-code/code_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/can-we-get-testcase-name-from-code/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page_t_can-we-get-testcase-name-from-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00000_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
