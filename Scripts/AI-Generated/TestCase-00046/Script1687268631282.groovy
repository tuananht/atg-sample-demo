import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unknown-error-element-is-not-clickable-at-point-566-128'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unknown-error-element-is-not-clickable-at-point-566-128/6172')

'step 2: At Page_t_unknown-error-element-is-not-clickable-at-point-566-128 input on input_search_term'

testObj = findTestObject('Object Repository/Page_t/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_object)

'step 3: Add visual checkpoint at Page_t_unknown-error-element-is-not-clickable-at-point-566-128'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00046_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
