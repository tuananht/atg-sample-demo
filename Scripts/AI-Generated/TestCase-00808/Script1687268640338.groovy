import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_docker-jenkins-parallel-run-on-jenkins-got-element-not-interactable-exception'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/docker-jenkins-parallel-run-on-jenkins-got-element-not-interactable-exception/67341')

'step 2: Add visual checkpoint at Page_t_docker-jenkins-parallel-run-on-jenkins-got-element-not-interactable-exception'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00808_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
