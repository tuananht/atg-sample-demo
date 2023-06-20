import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_azure-ci-cd-with-client-credentials'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/azure-ci-cd-with-client-credentials/39351')

'step 2: Add visual checkpoint at Page_t_azure-ci-cd-with-client-credentials'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00586_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
