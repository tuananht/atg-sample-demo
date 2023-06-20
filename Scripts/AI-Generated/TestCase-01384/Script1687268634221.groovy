import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_creation-of-test-object-in-object-repository-in-17'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/creation-of-test-object-in-object-repository-in-runtime/10333/17')

'step 2: Add visual checkpoint at Page_t_creation-of-test-object-in-object-repository-in-17'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01384_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
