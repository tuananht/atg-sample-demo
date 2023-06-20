import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-solve-the-unrecognized-token-error-using-ws-validatejsonagainstschema'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-solve-the-unrecognized-token-error-using-ws-validatejsonagainstschema/87371')

'step 2: Add visual checkpoint at Page_t_how-to-solve-the-unrecognized-token-error-using-ws-validatejsonagainstschema'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00596_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
