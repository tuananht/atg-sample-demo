import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_there-is-insufficient-memory-for-the-java-runtime-environment-to-continue'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/there-is-insufficient-memory-for-the-java-runtime-environment-to-continue/10090')

'step 2: At Page_t_there-is-insufficient-memory-for-the-java-runtime-environment-to-continue click on div_object'

testObj = findTestObject('Object Repository/Page_t_there-is-insufficient-memory-for-the-java-runtime-environment-to-continue/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/there-is-insufficient-memory-for-the-java-runtime-environment-to-continue/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_there-is-insufficient-memory-for-the-java-runtime-environment-to-continue'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00024_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
