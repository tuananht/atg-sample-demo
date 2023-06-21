import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_webinars'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/webinars')

'step 2: At Page_webinars click on div_object --> navigate to Page_webinars_erp-test-automation-sap'

testObj = findTestObject('Object Repository/Page_webinars/div_object_20')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/webinars(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_webinars_erp-test-automation-sap'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00009_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
