import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_simulator-architecture-is-unsupported-by-and-make-sure-the-correct-deployment-target-has-been-selected-for-its-compilation-in-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/simulator-architecture-is-unsupported-by-and-make-sure-the-correct-deployment-target-has-been-selected-for-its-compilation-in-xcode/46510/2')

'step 2: Add visual checkpoint at Page_t_simulator-architecture-is-unsupported-by-and-make-sure-the-correct-deployment-target-has-been-selected-for-its-compilation-in-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00136_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
